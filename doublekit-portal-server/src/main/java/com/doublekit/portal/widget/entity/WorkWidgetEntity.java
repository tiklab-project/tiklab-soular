package com.doublekit.portal.widget.entity;

import com.doublekit.dal.jpa.annotation.*;

import java.io.Serializable;

@Entity
@Table(name="work_widget")
public class WorkWidgetEntity implements Serializable {
    @Id
    @GeneratorValue
    @Column(name = "id",length = 32)
    private String id;

    @Column(name = "name",length = 32,notNull = true)
    private String name;

    @Column(name = "code",length = 32,notNull = true)
    private String code;

    @Column(name = "description",length = 256)
    private String description;


    @Column(name = "type",length = 32)
    private String type;

    @Column(name = "web_url",length = 64)
    private String webUrl;

    @Column(name = "api_url",length = 64)
    private String apiUrl;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
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
