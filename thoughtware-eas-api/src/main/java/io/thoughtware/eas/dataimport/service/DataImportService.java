package io.thoughtware.eas.dataimport.service;

import io.thoughtware.eas.dataimport.model.ImportDatabase;
import io.thoughtware.eas.dataimport.model.ImportDateMessage;

/**
 * 数据导入服务
 * @author admin
 */
public interface DataImportService {

    /**
     * 导入顺序
     * @param database 数据库信息
     */
    void dataImport(ImportDatabase database);

    /**
     * 获取导入进度
     * @return 导入进度
     */
    ImportDateMessage findImportMessage();



}
