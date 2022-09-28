package net.tiklab.eas.widget.service;

import net.tiklab.eas.widget.model.WorkWidgetLayout;
import net.tiklab.eas.widget.model.WorkWidgetLayoutQuery;


public interface WorkWidgetLayoutService {

    WorkWidgetLayout findWidgetLayout(WorkWidgetLayoutQuery workWidgetLayoutQuery);

    String createWidgetLayout(WorkWidgetLayout workWidgetLayout);

    void updateWidgetLayout(WorkWidgetLayout workWidgetLayout);

    WorkWidgetLayout findWidgetLayoutOne();

}
