package com.doublekit.widget.model;
import com.doublekit.apibox.annotation.ApiModel;
import com.doublekit.apibox.annotation.ApiProperty;
import com.doublekit.core.BaseModel;
import com.doublekit.beans.annotation.Mapper;
import javax.validation.constraints.NotNull;

@ApiModel
@Mapper(targetAlias = "WorkWidgetEntity")
public class WorkWidget  extends BaseModel{

    @ApiProperty(name="id",desc="唯一标识")
    private java.lang.String id;

    @NotNull
    @ApiProperty(name ="name",desc = "widget名称")
    private String name;

    @NotNull
    @ApiProperty(name ="code",desc = "widget编码")
    private String code;


    @ApiProperty(name ="description",desc = "描述")
    private String description;


    @NotNull
    @ApiProperty(name ="type",desc = "类型值：protal、project、apibox")
    private String type;

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
