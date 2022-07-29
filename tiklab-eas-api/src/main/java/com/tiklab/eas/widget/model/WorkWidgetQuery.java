package com.tiklab.eas.widget.model;

import com.tiklab.postlink.annotation.ApiModel;
import com.tiklab.postlink.annotation.ApiProperty;
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
