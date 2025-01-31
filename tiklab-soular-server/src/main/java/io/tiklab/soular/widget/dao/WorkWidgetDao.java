package io.tiklab.soular.widget.dao;

import io.tiklab.soular.widget.entity.WorkWidgetEntity;
import io.tiklab.core.page.Pagination;
import io.tiklab.dal.jpa.JpaTemplate;
import io.tiklab.dal.jpa.criterial.condition.QueryCondition;
import io.tiklab.dal.jpa.criterial.conditionbuilder.QueryBuilders;
import io.tiklab.soular.widget.model.WorkWidgetQuery;
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

    public Pagination<WorkWidgetEntity> findWorkWidgetPage (WorkWidgetQuery workWidgetQuery) {
        QueryCondition queryCondition = QueryBuilders.createQuery(WorkWidgetEntity.class)
                .eq("type", workWidgetQuery.getType())
                .pagination(workWidgetQuery.getPageParam()).get();
        return jpaTemplate.findPage(queryCondition,WorkWidgetEntity.class);
    }
}
