package io.thoughtware.darth.widget.service;

import io.thoughtware.darth.widget.dao.WorkWidgetLayoutDao;
import io.thoughtware.darth.widget.entity.WorkWidgetLayoutEntity;
import io.thoughtware.beans.BeanMapper;
import io.thoughtware.darth.widget.model.WorkWidgetLayout;
import io.thoughtware.darth.widget.model.WorkWidgetLayoutQuery;
import io.thoughtware.rpc.annotation.Exporter;
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
