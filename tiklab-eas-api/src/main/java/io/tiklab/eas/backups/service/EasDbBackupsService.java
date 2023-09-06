package io.tiklab.eas.backups.service;

import io.tiklab.eas.backups.model.EasBackups;

public interface EasDbBackupsService {


    /**
     * 备份数据
     */
    void execBackups();


    /**
     * 查询备份信息
     * @return 备份信息
     */
    EasBackups findBackupsResult();



}
