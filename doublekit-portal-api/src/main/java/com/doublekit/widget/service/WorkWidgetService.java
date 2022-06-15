package com.doublekit.widget.service;

import com.doublekit.widget.model.WorkWidget;
import com.doublekit.widget.model.WorkWidgetQuery;

import java.util.List;

public interface WorkWidgetService {

    List<WorkWidget> findWorkWidgetAll(WorkWidgetQuery workWidgetQuery);

    String createWorkWidget(WorkWidget workWidget);

    void updateWorkWidget(WorkWidget workWidget);

    void deleteWorkWidget(String id);
}
