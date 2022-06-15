package com.doublekit.portal.widget.service;

import com.doublekit.beans.BeanMapper;
import com.doublekit.portal.widget.dao.WorkWidgetLayoutDao;
import com.doublekit.portal.widget.entity.WorkWidgetLayoutEntity;
import com.doublekit.widget.model.WorkWidgetLayout;
import com.doublekit.widget.model.WorkWidgetLayoutQuery;
import com.doublekit.widget.service.WorkWidgetLayoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkWidgetLayoutServiceImpl implements WorkWidgetLayoutService {

    @Autowired
    WorkWidgetLayoutDao workWidgetLayoutDao;

    @Override
    public WorkWidgetLayout findWidgetLayout(WorkWidgetLayoutQuery workWidgetLayoutQuery) {
        WorkWidgetLayoutEntity workWidgetLayoutEntity = workWidgetLayoutDao.findWorkWidgetLayoutOne(workWidgetLayoutQuery);
        WorkWidgetLayout widgetLayout = BeanMapper.map(workWidgetLayoutEntity, WorkWidgetLayout.class);
        return widgetLayout;
    }

    @Override
    public String createWidgetLayout(WorkWidgetLayout workWidgetLayout) {
        WorkWidgetLayoutEntity workWidgetLayoutEntity = BeanMapper.map(workWidgetLayout, WorkWidgetLayoutEntity.class);
        return workWidgetLayoutDao.createWorkWidgetLayout(workWidgetLayoutEntity);
    }

    @Override
    public void updateWidgetLayout(WorkWidgetLayout workWidgetLayout) {
        WorkWidgetLayoutEntity workWidgetLayoutEntity = BeanMapper.map(workWidgetLayout, WorkWidgetLayoutEntity.class);
        workWidgetLayoutDao.updateWorkWidgetLayout(workWidgetLayoutEntity);
    }
}
