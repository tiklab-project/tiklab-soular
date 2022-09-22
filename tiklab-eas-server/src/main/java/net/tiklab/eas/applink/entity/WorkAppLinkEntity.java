package net.tiklab.eas.applink.entity;


import net.tiklab.dal.jpa.annotation.*;

import java.io.Serializable;

@Entity
@Table(name="poo_work_app_link")
public class WorkAppLinkEntity implements Serializable {

    @Id
    @GeneratorValue
    @Column(name = "id",length = 32)
    private String id;

    @Column(name = "grouper",length = 64,notNull = true)
    private String group;

    @Column(name = "app_type",length = 32,notNull = true)
    private String appType;

    @Column(name = "icon_url",length = 256)
    private String iconUrl;

    @Column(name = "app_url",length = 256,notNull = true)
    private String appUrl;

    @Column(name = "sort",length = 4)
    private Integer sort;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType;
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