package io.thoughtware.soular.widget.service;

import io.thoughtware.soular.widget.dao.WorkWidgetDao;
import io.thoughtware.soular.widget.entity.WorkWidgetEntity;
import io.thoughtware.toolkit.beans.BeanMapper;
import io.thoughtware.core.page.Pagination;
import io.thoughtware.core.page.PaginationBuilder;
import io.thoughtware.soular.widget.model.WorkWidget;
import io.thoughtware.soular.widget.model.WorkWidgetQuery;
import io.thoughtware.rpc.annotation.Exporter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@Service
@Exporter
public class WorkWidgetServiceImpl implements WorkWidgetService {

    @Autowired
    WorkWidgetDao workWidgetDao;

    @Override
    public List<WorkWidget> findWorkWidgetAll(WorkWidgetQuery workWidgetQuery) {
        List<WorkWidgetEntity> workWidgetEntities =  workWidgetDao.findWorkWidgetList(workWidgetQuery);
        List<WorkWidget> workWidgets = BeanMapper.mapList(workWidgetEntities, WorkWidget.class);
        return workWidgets;
    }

    @Override
    public String createWorkWidget(@NotNull @Valid WorkWidget workWidget) {
        WorkWidgetEntity workWidgetEntity = BeanMapper.map(workWidget, WorkWidgetEntity.class);

        return workWidgetDao.createWorkWidget(workWidgetEntity);
    }

    @Override
    public void updateWorkWidget(WorkWidget workWidget) {
        WorkWidgetEntity workWidgetEntity = BeanMapper.map(workWidget, WorkWidgetEntity.class);
        workWidgetDao.updateWorkWidget(workWidgetEntity);
    }


    @Override
    public void deleteWorkWidget(@NotNull String id) {
        workWidgetDao.deleteWorkWidget(id);
    }

    @Override
    public Pagination<WorkWidget> findWorkWidgetPage(WorkWidgetQuery workWidgetQuery) {
        Pagination<WorkWidgetEntity> workWidgetPage = workWidgetDao.findWorkWidgetPage(workWidgetQuery);
        List<WorkWidget> workWidgets = BeanMapper.mapList(workWidgetPage.getDataList(), WorkWidget.class);
        return PaginationBuilder.build(workWidgetPage,workWidgets);
    }
}
