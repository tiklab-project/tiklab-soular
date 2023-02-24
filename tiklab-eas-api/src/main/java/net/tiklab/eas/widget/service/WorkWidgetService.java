package net.tiklab.eas.widget.service;



import net.tiklab.core.page.Pagination;
import net.tiklab.eas.widget.model.WorkWidget;
import net.tiklab.eas.widget.model.WorkWidgetQuery;

import java.util.List;

public interface WorkWidgetService {

    List<WorkWidget> findWorkWidgetAll(WorkWidgetQuery workWidgetQuery);

    String createWorkWidget(WorkWidget workWidget);

    void updateWorkWidget(WorkWidget workWidget);

    void deleteWorkWidget(String id);

    Pagination<WorkWidget> findWorkWidgetPage(WorkWidgetQuery workWidgetQuery);
}
