package io.tiklab.eas.widget.service;

import io.tiklab.eas.widget.dao.WorkWidgetLayoutDao;
import io.tiklab.eas.widget.entity.WorkWidgetLayoutEntity;
import io.tiklab.beans.BeanMapper;
import io.tiklab.eas.widget.model.WorkWidgetLayout;
import io.tiklab.eas.widget.model.WorkWidgetLayoutQuery;
import io.tiklab.rpc.annotation.Exporter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Exporter
public class WorkWidgetLayoutServiceImpl implements WorkWidgetLayoutService {

    @Autowired
    WorkWidgetLayoutDao workWidgetLayoutDao;

    @Override
    public WorkWidgetLayout findWidgetLayout(WorkWidgetLayoutQuery workWidgetLayoutQuery) {
        WorkWidgetLayoutEntity workWidgetLayoutEntity = workWidgetLayoutDao.findWorkWidgetLayout(workWidgetLayoutQuery);
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

    @Override
    public WorkWidgetLayout findWidgetLayoutOne() {
        WorkWidgetLayoutEntity workWidgetLayoutEntity = workWidgetLayoutDao.findWorkWidgetLayoutOne();
        WorkWidgetLayout widgetLayout = BeanMapper.map(workWidgetLayoutEntity, WorkWidgetLayout.class);
        return widgetLayout;
    }
}