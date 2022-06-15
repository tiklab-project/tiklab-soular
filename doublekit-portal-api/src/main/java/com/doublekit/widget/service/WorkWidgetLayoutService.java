package com.doublekit.widget.service;

import com.doublekit.widget.model.WorkWidgetLayout;
import com.doublekit.widget.model.WorkWidgetLayoutQuery;



public interface WorkWidgetLayoutService {

    WorkWidgetLayout findWidgetLayout(WorkWidgetLayoutQuery workWidgetLayoutQuery);

    String createWidgetLayout(WorkWidgetLayout workWidgetLayout);

    void updateWidgetLayout(WorkWidgetLayout workWidgetLayout);

}
