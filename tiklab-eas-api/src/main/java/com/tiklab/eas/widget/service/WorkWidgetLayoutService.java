package com.tiklab.eas.widget.service;

import com.tiklab.eas.widget.model.WorkWidgetLayout;
import com.tiklab.eas.widget.model.WorkWidgetLayoutQuery;


public interface WorkWidgetLayoutService {

    WorkWidgetLayout findWidgetLayout(WorkWidgetLayoutQuery workWidgetLayoutQuery);

    String createWidgetLayout(WorkWidgetLayout workWidgetLayout);

    void updateWidgetLayout(WorkWidgetLayout workWidgetLayout);

}
