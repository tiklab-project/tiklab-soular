package com.doublekit.widget.model;

import com.doublekit.apibox.annotation.ApiModel;
import com.doublekit.apibox.annotation.ApiProperty;
import com.doublekit.beans.annotation.Mapper;

import javax.validation.constraints.NotNull;

@ApiModel
public class WorkWidgetLayoutQuery {

    @NotNull
    @ApiProperty(name ="uid",desc = "用户id")
    private String uid;

    @ApiProperty(name ="tenant",desc = "企业租户id")
    private String tenant;


    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getTenant() {
        return tenant;
    }

    public void setTenant(String tenant) {
        this.tenant = tenant;
    }

}
