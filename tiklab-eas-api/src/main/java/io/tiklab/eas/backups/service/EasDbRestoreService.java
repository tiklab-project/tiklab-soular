package io.tiklab.eas.backups.service;

import io.tiklab.eas.backups.model.EasBackups;

import java.io.InputStream;

public interface EasDbRestoreService {


    String uploadBackups(String fileName, InputStream inputStream);


    void execRestore(String filePath);


    EasBackups findRestoreResult();





}
