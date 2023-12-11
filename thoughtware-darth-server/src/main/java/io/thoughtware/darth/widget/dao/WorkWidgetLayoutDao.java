package io.thoughtware.darth.widget.dao;

import io.thoughtware.darth.widget.entity.WorkWidgetLayoutEntity;
import io.thoughtware.dal.jpa.JpaTemplate;
import io.thoughtware.dal.jpa.criterial.condition.QueryCondition;
import io.thoughtware.dal.jpa.criterial.conditionbuilder.QueryBuilders;
import io.thoughtware.darth.widget.model.WorkWidgetLayoutQuery;
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

    public WorkWidgetLayoutEntity findWorkWidgetLayout(WorkWidgetLayoutQuery workWidgetLayoutQuery) {
        QueryCondition queryCondition = QueryBuilders.createQuery(WorkWidgetLayoutEntity.class)
//                .eq("uid", workWidgetLayoutQuery.getUid())
//                .eq("tenant", workWidgetLayoutQuery.getTenant())
                .get();
        List<WorkWidgetLayoutEntity> list = jpaTemplate.findList(queryCondition, WorkWidgetLayoutEntity.class);

        if (list.size() > 0) {
            return list.get(0);
        }
        return null;
    }


    public WorkWidgetLayoutEntity findWorkWidgetLayoutOne() {
        List<WorkWidgetLayoutEntity> all = jpaTemplate.findAll(WorkWidgetLayoutEntity.class);
        if (all.size() > 0) {
            return all.get(0);
        }
        return null;
    }
}
