package io.thoughtware.soular.widget.service;


import io.thoughtware.soular.widget.model.WorkWidgetLayout;
import io.thoughtware.soular.widget.model.WorkWidgetLayoutQuery;

public interface WorkWidgetLayoutService {

    WorkWidgetLayout findWidgetLayout(WorkWidgetLayoutQuery workWidgetLayoutQuery);

    String createWidgetLayout(WorkWidgetLayout workWidgetLayout);

    void updateWidgetLayout(WorkWidgetLayout workWidgetLayout);

    WorkWidgetLayout findWidgetLayoutOne();

}
