package com.doublekit.portal.widget.dao;

import com.doublekit.dal.jpa.JpaTemplate;
import com.doublekit.dal.jpa.criterial.condition.QueryCondition;
import com.doublekit.dal.jpa.criterial.conditionbuilder.QueryBuilders;
import com.doublekit.portal.widget.entity.WorkWidgetEntity;
import com.doublekit.widget.model.WorkWidgetQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class WorkWidgetDao {
    private static Logger logger = LoggerFactory.getLogger(WorkWidgetDao.class);

    @Autowired
    JpaTemplate jpaTemplate;

    public String createWorkWidget(WorkWidgetEntity workWidgetEntity){
        return jpaTemplate.save(workWidgetEntity,String.class);
    }


    public void updateWorkWidget(WorkWidgetEntity workWidgetEntity){
        jpaTemplate.update(workWidgetEntity);
    }

    public void deleteWorkWidget(String id) {
        jpaTemplate.delete(WorkWidgetEntity.class,id);
    }

    public List<WorkWidgetEntity> findWorkWidgetList (WorkWidgetQuery workWidgetQuery) {
        QueryCondition queryCondition = QueryBuilders.createQuery(WorkWidgetEntity.class)
                .eq("type", workWidgetQuery.getType())
                .get();
        return jpaTemplate.findList(queryCondition,WorkWidgetEntity.class);
    }
}
