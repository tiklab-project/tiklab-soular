package io.tiklab.eas.widget.service;

import io.tiklab.eas.widget.dao.WorkWidgetDao;
import io.tiklab.eas.widget.entity.WorkWidgetEntity;
import net.tiklab.beans.BeanMapper;
import net.tiklab.core.page.Pagination;
import net.tiklab.core.page.PaginationBuilder;
import io.tiklab.eas.widget.model.WorkWidget;
import io.tiklab.eas.widget.model.WorkWidgetQuery;
import net.tiklab.rpc.annotation.Exporter;
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
