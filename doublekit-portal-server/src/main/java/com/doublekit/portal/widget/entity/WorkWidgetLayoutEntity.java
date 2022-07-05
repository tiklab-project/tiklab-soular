package com.doublekit.portal.widget.entity;
import com.doublekit.dal.jpa.annotation.*;
import com.doublekit.widget.model.WorkWidget;

import java.io.Serializable;
import java.util.List;

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

    @Column(name = "right_dashboard")
    private String rightDashboard;


    @Column(name = "left_dashboard")
    private String leftDashboard;

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

    public String getRightDashboard() {
        return rightDashboard;
    }

    public void setRightDashboard(String rightDashboard) {
        this.rightDashboard = rightDashboard;
    }

    public String getLeftDashboard() {
        return leftDashboard;
    }

    public void setLeftDashboard(String leftDashboard) {
        this.leftDashboard = leftDashboard;
    }
}
