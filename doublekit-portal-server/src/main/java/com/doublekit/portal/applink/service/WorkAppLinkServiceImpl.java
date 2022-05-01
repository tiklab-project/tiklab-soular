package com.doublekit.portal.applink.service;

import com.doublekit.beans.BeanMapper;
import com.doublekit.core.page.Pagination;
import com.doublekit.core.page.PaginationBuilder;
import com.doublekit.join.JoinTemplate;
import com.doublekit.portal.applink.dao.WorkAppLinkDao;
import com.doublekit.portal.applink.entity.WorkAppLinkEntity;
import com.doublekit.portal.applink.model.WorkAppLink;
import com.doublekit.portal.applink.model.WorkAppLinkQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
* 认证配置服务业务处理
*/
@Service
public class WorkAppLinkServiceImpl implements WorkAppLinkService {

    @Autowired
    WorkAppLinkDao workAppLinkDao;

    @Autowired
    JoinTemplate joinTemplate;

    @Override
    public String createWorkAppLink(@NotNull @Valid WorkAppLink workAppLink) {
        WorkAppLinkEntity workAppLinkEntity = BeanMapper.map(workAppLink, WorkAppLinkEntity.class);

        return workAppLinkDao.createWorkAppLink(workAppLinkEntity);
    }

    @Override
    public void updateWorkAppLink(@NotNull @Valid WorkAppLink workAppLink) {
        WorkAppLinkEntity workAppLinkEntity = BeanMapper.map(workAppLink, WorkAppLinkEntity.class);

        workAppLinkDao.updateWorkAppLink(workAppLinkEntity);
    }

    @Override
    public void deleteWorkAppLink(@NotNull String id) {
        workAppLinkDao.deleteWorkAppLink(id);
    }

    @Override
    public WorkAppLink findOne(String id) {
        WorkAppLinkEntity workAppLinkEntity = workAppLinkDao.findWorkAppLink(id);

        WorkAppLink workAppLink = BeanMapper.map(workAppLinkEntity, WorkAppLink.class);
        return workAppLink;
    }

    @Override
    public List<WorkAppLink> findList(List<String> idList) {
        List<WorkAppLinkEntity> workAppLinkEntities =  workAppLinkDao.findWorkAppLinkList(idList);

        List<WorkAppLink> workAppLinkList =  BeanMapper.mapList(workAppLinkEntities, WorkAppLink.class);
        return workAppLinkList;
    }

    @Override
    public WorkAppLink findWorkAppLink(@NotNull String id) {
        WorkAppLink workAppLink = findOne(id);

        joinTemplate.joinQuery(workAppLink);
        return workAppLink;
    }

    @Override
    public List<WorkAppLink> findAllWorkAppLink() {
        List<WorkAppLinkEntity> workAppLinkEntities =  workAppLinkDao.findAllWorkAppLink();

        List<WorkAppLink> workAppLinkList =  BeanMapper.mapList(workAppLinkEntities, WorkAppLink.class);

        joinTemplate.joinQuery(workAppLinkList);
        return workAppLinkList;
    }

    @Override
    public List<WorkAppLink> findWorkAppLinkList(WorkAppLinkQuery workAppLinkQuery) {
        List<WorkAppLinkEntity> workAppLinkEntities = workAppLinkDao.findWorkAppLinkList(workAppLinkQuery);

        List<WorkAppLink> workAppLinkList = BeanMapper.mapList(workAppLinkEntities, WorkAppLink.class);

        joinTemplate.joinQuery(workAppLinkList);

        return workAppLinkList;
    }

    @Override
    public Pagination<WorkAppLink> findWorkAppLinkPage(WorkAppLinkQuery workAppLinkQuery) {
        Pagination<WorkAppLinkEntity> pagination = workAppLinkDao.findWorkAppLinkPage(workAppLinkQuery);

        List<WorkAppLink> workAppLinkList = BeanMapper.mapList(pagination.getDataList(), WorkAppLink.class);

        joinTemplate.joinQuery(workAppLinkList);

        return PaginationBuilder.build(pagination,workAppLinkList);
    }
}