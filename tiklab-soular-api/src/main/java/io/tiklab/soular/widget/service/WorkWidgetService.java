package io.tiklab.soular.widget.service;



import io.tiklab.core.page.Pagination;
import io.tiklab.soular.widget.model.WorkWidget;
import io.tiklab.soular.widget.model.WorkWidgetQuery;

import java.util.List;

public interface WorkWidgetService {

    List<WorkWidget> findWorkWidgetAll(WorkWidgetQuery workWidgetQuery);

    String createWorkWidget(WorkWidget workWidget);

    void updateWorkWidget(WorkWidget workWidget);

    void deleteWorkWidget(String id);

    Pagination<WorkWidget> findWorkWidgetPage(WorkWidgetQuery workWidgetQuery);
}
