package com.tiklab.eas.applink.model;

import com.tiklab.postin.annotation.ApiModel;
import com.tiklab.postin.annotation.ApiProperty;
import com.tiklab.beans.annotation.Mapper;
import com.tiklab.core.BaseModel;

import javax.validation.constraints.NotNull;

@ApiModel
@Mapper(targetAlias = "WorkAppLinkEntity")
public class WorkAppLink extends BaseModel {

    @ApiProperty(name="id",desc="唯一标识")
    private String id;

    @NotNull
    @ApiProperty(name="appType",desc="应用类型",required = true)
    private String appType;

    @NotNull
    @ApiProperty(name="group",desc="分组",required = true)
    private String group = "default";

    @ApiProperty(name="iconUrl",desc="图标路径")
    private String iconUrl;

    @NotNull
    @ApiProperty(name="appUrl",desc="应用路径",required = true)
    private String appUrl;

    @ApiProperty(name="sort",desc="排序")
    private Integer sort;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getAppUrl() {
        return appUrl;
    }

    public void setAppUrl(String appUrl) {
        this.appUrl = appUrl;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}
