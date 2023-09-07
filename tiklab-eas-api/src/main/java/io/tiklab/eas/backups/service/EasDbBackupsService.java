package io.tiklab.eas.backups.service;

import io.tiklab.eas.backups.model.EasBackups;

import java.io.InputStream;

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


    /**
     * 更新备份是否定时开启
     * @param state true：开启 false：关闭
     */
    void updateBackups(Boolean state);




}
