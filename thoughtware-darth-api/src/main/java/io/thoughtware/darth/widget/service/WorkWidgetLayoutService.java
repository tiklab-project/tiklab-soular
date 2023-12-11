package io.thoughtware.darth.widget.service;


import io.thoughtware.darth.widget.model.WorkWidgetLayout;
import io.thoughtware.darth.widget.model.WorkWidgetLayoutQuery;

public interface WorkWidgetLayoutService {

    WorkWidgetLayout findWidgetLayout(WorkWidgetLayoutQuery workWidgetLayoutQuery);

    String createWidgetLayout(WorkWidgetLayout workWidgetLayout);

    void updateWidgetLayout(WorkWidgetLayout workWidgetLayout);

    WorkWidgetLayout findWidgetLayoutOne();

}
