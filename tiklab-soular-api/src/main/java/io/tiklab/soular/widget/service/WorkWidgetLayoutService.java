package io.tiklab.soular.widget.service;


import io.tiklab.soular.widget.model.WorkWidgetLayout;
import io.tiklab.soular.widget.model.WorkWidgetLayoutQuery;

public interface WorkWidgetLayoutService {

    WorkWidgetLayout findWidgetLayout(WorkWidgetLayoutQuery workWidgetLayoutQuery);

    String createWidgetLayout(WorkWidgetLayout workWidgetLayout);

    void updateWidgetLayout(WorkWidgetLayout workWidgetLayout);

    WorkWidgetLayout findWidgetLayoutOne();

}
