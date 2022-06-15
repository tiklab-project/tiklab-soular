package com.doublekit.widget.model;

import com.doublekit.apibox.annotation.ApiModel;
import com.doublekit.apibox.annotation.ApiProperty;
@ApiModel
public class WorkWidgetQuery {
    @ApiProperty(name="type",desc="所属项目",required = true)
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
