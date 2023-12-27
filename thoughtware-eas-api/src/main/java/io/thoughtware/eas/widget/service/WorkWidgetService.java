package io.thoughtware.eas.widget.service;



import io.thoughtware.core.page.Pagination;
import io.thoughtware.eas.widget.model.WorkWidget;
import io.thoughtware.eas.widget.model.WorkWidgetQuery;

import java.util.List;

public interface WorkWidgetService {

    List<WorkWidget> findWorkWidgetAll(WorkWidgetQuery workWidgetQuery);

    String createWorkWidget(WorkWidget workWidget);

    void updateWorkWidget(WorkWidget workWidget);

    void deleteWorkWidget(String id);

    Pagination<WorkWidget> findWorkWidgetPage(WorkWidgetQuery workWidgetQuery);
}
