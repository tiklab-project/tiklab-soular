package net.tiklab.eas.widget.model;

import net.tiklab.postin.annotation.ApiModel;
import net.tiklab.postin.annotation.ApiProperty;
import net.tiklab.beans.annotation.Mapper;

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
