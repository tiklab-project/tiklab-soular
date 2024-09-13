package io.thoughtware.soular.widget.service;

import io.thoughtware.soular.widget.dao.WorkWidgetLayoutDao;
import io.thoughtware.soular.widget.entity.WorkWidgetLayoutEntity;
import io.thoughtware.toolkit.beans.BeanMapper;
import io.thoughtware.soular.widget.model.WorkWidgetLayout;
import io.thoughtware.soular.widget.model.WorkWidgetLayoutQuery;
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
