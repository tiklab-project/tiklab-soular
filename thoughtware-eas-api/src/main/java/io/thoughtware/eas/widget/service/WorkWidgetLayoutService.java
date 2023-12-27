package io.thoughtware.eas.widget.service;


import io.thoughtware.eas.widget.model.WorkWidgetLayout;
import io.thoughtware.eas.widget.model.WorkWidgetLayoutQuery;

public interface WorkWidgetLayoutService {

    WorkWidgetLayout findWidgetLayout(WorkWidgetLayoutQuery workWidgetLayoutQuery);

    String createWidgetLayout(WorkWidgetLayout workWidgetLayout);

    void updateWidgetLayout(WorkWidgetLayout workWidgetLayout);

    WorkWidgetLayout findWidgetLayoutOne();

}
