package io.tiklab.eas.backups.service;

import io.tiklab.eas.backups.model.Backups;

import java.io.InputStream;

public interface DbRestoreService {


    String uploadBackups(String fileName, InputStream inputStream);


    void execRestore(String filePath);


    Backups findRestoreResult();





}
