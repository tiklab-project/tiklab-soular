package com.doublekit.widget.model;

import com.doublekit.apibox.annotation.ApiModel;
import com.doublekit.apibox.annotation.ApiProperty;
import com.doublekit.beans.annotation.Mapper;

import javax.validation.constraints.NotNull;
import java.util.List;

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


    @ApiProperty(name ="leftDashboard",desc = "Widget的布局坐标 [{WorkWidget}]")
    private String leftDashboard;

    @ApiProperty(name ="rightDashboard",desc = "Widget的布局坐标[{WorkWidget}]")
    private String rightDashboard;


    public String getLeftDashboard() {
        return leftDashboard;
    }

    public void setLeftDashboard(String leftDashboard) {
        this.leftDashboard = leftDashboard;
    }

    public String getRightDashboard() {
        return rightDashboard;
    }

    public void setRightDashboard(String rightDashboard) {
        this.rightDashboard = rightDashboard;
    }

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

}
