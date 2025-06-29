package io.tiklab.soular.widget.model;

import io.tiklab.postin.annotation.ApiProperty;
import io.tiklab.toolkit.beans.annotation.Mapper;
import io.tiklab.core.BaseModel;

import javax.validation.constraints.NotNull;


@Mapper
public class WorkWidget  extends BaseModel{

    @ApiProperty(name="id",desc="唯一标识")
    private String id;

    @NotNull
    private String name;

    @NotNull
    @ApiProperty(name ="code",desc = "应用编码")
    private String code;


    @ApiProperty(name ="description",desc = "描述")
    private String description;


    @NotNull
    @ApiProperty(name ="type",desc = "类型值")
    private String type;

    @NotNull
    @ApiProperty(name ="webUrl",desc = "页面跳转URL")
    private String webUrl;

    @NotNull
    @ApiProperty(name ="apiUrl",desc = "接口URL")
    private String apiUrl;

    @NotNull
    @ApiProperty(name ="dashboardType",desc = "面板布局类型")
    private String dashboardType;

    public String getDashboardType() {
        return dashboardType;
    }

    public void setDashboardType(String dashboardType) {
        this.dashboardType = dashboardType;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public String getApiUrl() {
        return apiUrl;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
