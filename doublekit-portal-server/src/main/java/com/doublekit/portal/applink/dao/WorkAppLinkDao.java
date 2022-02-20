package com.doublekit.portal.applink.dao;

import com.doublekit.common.page.Pagination;
import com.doublekit.dal.jpa.JpaTemplate;
import com.doublekit.dal.jpa.criterial.conditionbuilder.QueryBuilders;
import com.doublekit.dal.jpa.criterial.condition.DeleteCondition;
import com.doublekit.dal.jpa.criterial.condition.QueryCondition;
import com.doublekit.portal.applink.entity.WorkAppLinkEntity;
import com.doublekit.portal.applink.model.WorkAppLinkQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 认证配置数据操作
 */
@Repository
public class WorkAppLinkDao{

    private static Logger logger = LoggerFactory.getLogger(WorkAppLinkDao.class);

    @Autowired
    JpaTemplate jpaTemplate;

    /**
     * 创建认证配置
     * @param workAppLinkEntity
     * @return
     */
    public String createWorkAppLink(WorkAppLinkEntity workAppLinkEntity) {
        //设置序号
        Integer max = findMax();
        workAppLinkEntity.setSort(max+1);

        return jpaTemplate.save(workAppLinkEntity,String.class);
    }

    Integer findMax(){
        QueryCondition queryCondition  = QueryBuilders.createQuery(WorkAppLinkEntity.class)
                .max("sort")
                .get();
        //添加过滤条件
        Integer max = jpaTemplate.findObject(queryCondition,Integer.class);
        if(max == null){
            return 0;
        }
        return max;
    }

    /**
     * 更新认证配置
     * @param workAppLinkEntity
     */
    public void updateWorkAppLink(WorkAppLinkEntity workAppLinkEntity){
        jpaTemplate.update(workAppLinkEntity);
    }

    /**
     * 删除认证配置
     * @param id
     */
    public void deleteWorkAppLink(String id){
        jpaTemplate.delete(WorkAppLinkEntity.class,id);
    }

    public void deleteWorkAppLink(DeleteCondition deleteCondition){
        jpaTemplate.delete(deleteCondition);
    }

    /**
     * 查找认证配置
     * @param id
     * @return
     */
    public WorkAppLinkEntity findWorkAppLink(String id){
        return jpaTemplate.findOne(WorkAppLinkEntity.class,id);
    }

    /**
    * findAllWorkAppLink
    * @return
    */
    public List<WorkAppLinkEntity> findAllWorkAppLink() {
        return jpaTemplate.findAll(WorkAppLinkEntity.class);
    }

    public List<WorkAppLinkEntity> findWorkAppLinkList(List<String> idList) {
        return jpaTemplate.findList(WorkAppLinkEntity.class,idList);
    }

    public List<WorkAppLinkEntity> findWorkAppLinkList(WorkAppLinkQuery workAppLinkQuery) {
        return jpaTemplate.findList(workAppLinkQuery,WorkAppLinkEntity.class);
    }

    public Pagination<WorkAppLinkEntity> findWorkAppLinkPage(WorkAppLinkQuery workAppLinkQuery) {
        return jpaTemplate.findPage(workAppLinkQuery,WorkAppLinkEntity.class);
    }
}