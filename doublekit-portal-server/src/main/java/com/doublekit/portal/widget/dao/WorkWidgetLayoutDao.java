package com.doublekit.portal.widget.dao;

import com.doublekit.dal.jpa.JpaTemplate;
import com.doublekit.dal.jpa.criterial.condition.QueryCondition;
import com.doublekit.dal.jpa.criterial.conditionbuilder.QueryBuilders;
import com.doublekit.portal.widget.entity.WorkWidgetEntity;
import com.doublekit.portal.widget.entity.WorkWidgetLayoutEntity;
import com.doublekit.widget.model.WorkWidgetLayoutQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class WorkWidgetLayoutDao {

    private static Logger logger = LoggerFactory.getLogger(WorkWidgetLayoutDao.class);

    @Autowired
    JpaTemplate jpaTemplate;

    public String createWorkWidgetLayout(WorkWidgetLayoutEntity workWidgetLayoutEntity){
        return jpaTemplate.save(workWidgetLayoutEntity,String.class);
    }

    public void updateWorkWidgetLayout(WorkWidgetLayoutEntity workWidgetLayoutEntity) {
        jpaTemplate.update(workWidgetLayoutEntity);
    }

    public WorkWidgetLayoutEntity findWorkWidgetLayoutOne(WorkWidgetLayoutQuery workWidgetLayoutQuery) {
        QueryCondition queryCondition = QueryBuilders.createQuery(WorkWidgetLayoutEntity.class)
                .eq("uid", workWidgetLayoutQuery.getUid())
                .eq("tenant", workWidgetLayoutQuery.getTenant())
                .get();
        List<WorkWidgetLayoutEntity> list = jpaTemplate.findList(queryCondition, WorkWidgetLayoutEntity.class);

        if (list.size() > 0) {
            return list.get(0);
        }
        return null;
    }
}
