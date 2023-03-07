package io.tiklab.eas.widget.service;


import io.tiklab.eas.widget.model.WorkWidgetLayout;
import io.tiklab.eas.widget.model.WorkWidgetLayoutQuery;

public interface WorkWidgetLayoutService {

    WorkWidgetLayout findWidgetLayout(WorkWidgetLayoutQuery workWidgetLayoutQuery);

    String createWidgetLayout(WorkWidgetLayout workWidgetLayout);

    void updateWidgetLayout(WorkWidgetLayout workWidgetLayout);

    WorkWidgetLayout findWidgetLayoutOne();

}
