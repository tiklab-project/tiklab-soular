package io.tiklab.eas.widget.model;


import javax.validation.constraints.NotNull;

public class WorkWidgetLayoutQuery {

    @NotNull
//    @ApiProperty(name ="uid",desc = "用户id")
    private String uid;

//    @ApiProperty(name ="tenant",desc = "企业租户id")
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
