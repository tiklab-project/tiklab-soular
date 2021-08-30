package com.doublekit.portal.applink.service;

import com.doublekit.common.Pagination;
import com.doublekit.portal.applink.model.WorkAppLink;
import com.doublekit.portal.applink.model.WorkAppLinkQuery;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
* 认证配置服务接口
*/
public interface WorkAppLinkService {

    /**
    * 创建认证配置
    * @param workAppLink
    * @return
    */
    String createWorkAppLink(@NotNull @Valid WorkAppLink workAppLink);

    /**
    * 更新认证配置
    * @param workAppLink
    */
    void updateWorkAppLink(@NotNull @Valid WorkAppLink workAppLink);

    /**
    * 删除认证配置
    * @param id
    */
    void deleteWorkAppLink(@NotNull String id);

    WorkAppLink findOne(@NotNull String id);

    List<WorkAppLink> findList(List<String> idList);

    /**
    * 查找认证配置
    * @param id
    * @return
    */
    WorkAppLink findWorkAppLink(@NotNull String id);

    /**
    * 查找所有
    * @return
    */
    List<WorkAppLink> findAllWorkAppLink();

    /**
    * 查询列表
    * @param workAppLinkQuery
    * @return
    */
    List<WorkAppLink> findWorkAppLinkList(WorkAppLinkQuery workAppLinkQuery);

    /**
    * 按分页查询
    * @param workAppLinkQuery
    * @return
    */
    Pagination<WorkAppLink> findWorkAppLinkPage(WorkAppLinkQuery workAppLinkQuery);

}