package com.doublekit.portal.applink.service;

import com.doublekit.beans.BeanMapper;
import com.doublekit.common.Pagination;
import com.doublekit.join.join.JoinQuery;
import com.doublekit.toolkit.applink.dao.WorkAppLinkDao;
import com.doublekit.toolkit.applink.entity.WorkAppLinkPo;
import com.doublekit.toolkit.applink.model.WorkAppLink;
import com.doublekit.toolkit.applink.model.WorkAppLinkQuery;
import com.doublekit.toolkit.applink.service.WorkAppLinkService;
import org.springframework.beans.BeanUtils;
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
    JoinQuery joinQuery;

    @Override
    public String createWorkAppLink(@NotNull @Valid WorkAppLink workAppLink) {
        WorkAppLinkPo workAppLinkPo = BeanMapper.map(workAppLink, WorkAppLinkPo.class);

        return workAppLinkDao.createWorkAppLink(workAppLinkPo);
    }

    @Override
    public void updateWorkAppLink(@NotNull @Valid WorkAppLink workAppLink) {
        WorkAppLinkPo workAppLinkPo = BeanMapper.map(workAppLink, WorkAppLinkPo.class);

        workAppLinkDao.updateWorkAppLink(workAppLinkPo);
    }

    @Override
    public void deleteWorkAppLink(@NotNull String id) {
        workAppLinkDao.deleteWorkAppLink(id);
    }

    @Override
    public WorkAppLink findOne(String id) {
        WorkAppLinkPo workAppLinkPo = workAppLinkDao.findWorkAppLink(id);

        WorkAppLink workAppLink = BeanMapper.map(workAppLinkPo, WorkAppLink.class);
        return workAppLink;
    }

    @Override
    public List<WorkAppLink> findList(List<String> idList) {
        List<WorkAppLinkPo> workAppLinkPoList =  workAppLinkDao.findWorkAppLinkList(idList);

        List<WorkAppLink> workAppLinkList =  BeanMapper.mapList(workAppLinkPoList, WorkAppLink.class);
        return workAppLinkList;
    }

    @Override
    public WorkAppLink findWorkAppLink(@NotNull String id) {
        WorkAppLink workAppLink = findOne(id);

        joinQuery.queryOne(workAppLink);
        return workAppLink;
    }

    @Override
    public List<WorkAppLink> findAllWorkAppLink() {
        List<WorkAppLinkPo> workAppLinkPoList =  workAppLinkDao.findAllWorkAppLink();

        List<WorkAppLink> workAppLinkList =  BeanMapper.mapList(workAppLinkPoList, WorkAppLink.class);

        joinQuery.queryList(workAppLinkList);
        return workAppLinkList;
    }

    @Override
    public List<WorkAppLink> findWorkAppLinkList(WorkAppLinkQuery workAppLinkQuery) {
        List<WorkAppLinkPo> workAppLinkPoList = workAppLinkDao.findWorkAppLinkList(workAppLinkQuery);

        List<WorkAppLink> workAppLinkList = BeanMapper.mapList(workAppLinkPoList, WorkAppLink.class);

        joinQuery.queryList(workAppLinkList);

        return workAppLinkList;
    }

    @Override
    public Pagination<WorkAppLink> findWorkAppLinkPage(WorkAppLinkQuery workAppLinkQuery) {
        Pagination<WorkAppLink> pg = new Pagination<>();

        Pagination<WorkAppLinkPo> pagination = workAppLinkDao.findWorkAppLinkPage(workAppLinkQuery);
        BeanUtils.copyProperties(pagination,pg);

        List<WorkAppLink> workAppLinkList = BeanMapper.mapList(pagination.getDataList(), WorkAppLink.class);

        joinQuery.queryList(workAppLinkList);

        pg.setDataList(workAppLinkList);
        return pg;
    }
}