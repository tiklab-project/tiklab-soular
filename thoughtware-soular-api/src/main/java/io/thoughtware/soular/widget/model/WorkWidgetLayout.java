package io.thoughtware.soular.widget.model;

import io.thoughtware.toolkit.beans.annotation.Mapper;

@Mapper
public class WorkWidgetLayout {
//    @ApiProperty(name="id",desc="唯一标识")
    private String id;

//    @NotNull
//    @ApiProperty(name ="uid",desc = "用户id")
//    private String uid;


//    @ApiProperty(name ="tenant",desc = "企业租户id")
//    private String tenant;


//    @ApiProperty(name ="leftDashboard",desc = "Widget的布局坐标 [{WorkWidget}]")
    private String leftDashboard;

//    @ApiProperty(name ="rightDashboard",desc = "Widget的布局坐标[{WorkWidget}]")
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


}
