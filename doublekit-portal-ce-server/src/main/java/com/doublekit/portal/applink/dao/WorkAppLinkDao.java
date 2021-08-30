package com.doublekit.portal.applink.dao;

import com.doublekit.common.Pagination;
import com.doublekit.dal.jpa.JpaTemplate;
import com.doublekit.dal.jpa.builder.deletelist.condition.DeleteCondition;
import com.doublekit.dal.jpa.builder.querylist.condition.QueryCondition;
import com.doublekit.dal.jpa.builder.querylist.conditionbuilder.QueryBuilders;
import com.doublekit.portal.applink.entity.WorkAppLinkPo;
import com.doublekit.portal.applink.model.WorkAppLinkQuery;
import com.doublekit.toolkit.applink.entity.AppLinkPo;
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
     * @param workAppLinkPo
     * @return
     */
    public String createWorkAppLink(WorkAppLinkPo workAppLinkPo) {
        //设置序号
        Integer max = findMax();
        workAppLinkPo.setSort(max+1);

        return jpaTemplate.save(workAppLinkPo,String.class);
    }

    Integer findMax(){
        QueryCondition queryCondition  = QueryBuilders.instance()
                .max("sort")
                .get();
        //添加过滤条件
        Integer max = jpaTemplate.findOne(AppLinkPo.class,queryCondition,Integer.class);
        if(max == null){
            return 0;
        }
        return max;
    }

    /**
     * 更新认证配置
     * @param workAppLinkPo
     */
    public void updateWorkAppLink(WorkAppLinkPo workAppLinkPo){
        jpaTemplate.update(workAppLinkPo);
    }

    /**
     * 删除认证配置
     * @param id
     */
    public void deleteWorkAppLink(String id){
        jpaTemplate.delete(WorkAppLinkPo.class,id);
    }

    public void deleteWorkAppLink(DeleteCondition deleteCondition){
        jpaTemplate.delete(WorkAppLinkPo.class,deleteCondition);
    }

    /**
     * 查找认证配置
     * @param id
     * @return
     */
    public WorkAppLinkPo findWorkAppLink(String id){
        return jpaTemplate.findOne(WorkAppLinkPo.class,id);
    }

    /**
    * findAllWorkAppLink
    * @return
    */
    public List<WorkAppLinkPo> findAllWorkAppLink() {
        return jpaTemplate.findAll(WorkAppLinkPo.class);
    }

    public List<WorkAppLinkPo> findWorkAppLinkList(List<String> idList) {
        return jpaTemplate.findList(WorkAppLinkPo.class,idList);
    }

    public List<WorkAppLinkPo> findWorkAppLinkList(WorkAppLinkQuery workAppLinkQuery) {
        return jpaTemplate.findList(WorkAppLinkPo.class,workAppLinkQuery);
    }

    public Pagination<WorkAppLinkPo> findWorkAppLinkPage(WorkAppLinkQuery workAppLinkQuery) {
        return jpaTemplate.findPage(WorkAppLinkPo.class,workAppLinkQuery);
    }
}