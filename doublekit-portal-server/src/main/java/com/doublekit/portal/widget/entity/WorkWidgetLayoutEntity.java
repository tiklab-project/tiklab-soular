package com.doublekit.portal.widget.entity;
import com.doublekit.dal.jpa.annotation.*;

import java.io.Serializable;

@Entity
@Table(name="work_widget_layout")
public class WorkWidgetLayoutEntity implements Serializable{

    @Id
    @GeneratorValue
    @Column(name = "id",length = 32)
    private String id;

    @Column(name = "uid",length = 32)
    private String uid;

    @Column(name = "tenant",length = 32)
    private String tenant;

    @Column(name = "layout")
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
