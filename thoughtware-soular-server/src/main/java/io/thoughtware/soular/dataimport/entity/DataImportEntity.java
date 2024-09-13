package io.thoughtware.soular.dataimport.entity;

import io.thoughtware.dal.jpa.annotation.*;

/**
 * @author admin 数据导入
 */

@Entity
@Table(name="eas_data_import")
public class DataImportEntity {

    @Id
    @GeneratorValue(length = 12)
    @Column(name = "id",length = 12)
    private String id;

    @Column(name = "application")
    private String application;

    @Column(name = "data_url")
    private String dataUrl;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getDataUrl() {
        return dataUrl;
    }

    public void setDataUrl(String dataUrl) {
        this.dataUrl = dataUrl;
    }
}
