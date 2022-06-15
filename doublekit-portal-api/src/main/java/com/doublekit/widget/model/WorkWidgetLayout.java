package com.doublekit.widget.model;

import com.doublekit.apibox.annotation.ApiModel;
import com.doublekit.apibox.annotation.ApiProperty;
import com.doublekit.beans.annotation.Mapper;

import javax.validation.constraints.NotNull;

@ApiModel
@Mapper(targetAlias = "WorkWidgetLayoutEntity")
public class WorkWidgetLayout {
    @ApiProperty(name="id",desc="唯一标识")
    private java.lang.String id;

    @NotNull
    @ApiProperty(name ="uid",desc = "用户id")
    private String uid;


    @ApiProperty(name ="tenant",desc = "企业租户id")
    private String tenant;

    @ApiProperty(name ="layout",desc = "Widget的布局坐标 [{i: 'Widget的id', x: 坐标x, y: 坐标Y, w: 宽度列, h: 高度列}]")
    private String layout;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }
}
