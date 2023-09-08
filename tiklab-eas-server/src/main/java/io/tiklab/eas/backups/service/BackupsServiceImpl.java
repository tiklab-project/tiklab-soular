package io.tiklab.eas.backups.service;

import io.tiklab.eas.backups.dao.EasBackupsDao;
import io.tiklab.eas.backups.model.Backups;
import io.tiklab.eas.backups.model.BackupsQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class BackupsServiceImpl implements BackupsService {

    @Autowired
    EasBackupsDao backupsDao;


    public String createBackups(Backups backups){
       return backupsDao.createBackups(backups);
    }

    public void updateBackups(Backups backups){
        backupsDao.updateBackups(backups);
    }

    public void deleteBackups(String backupsId){
        backupsDao.deleteBackups(backupsId);
    }


    public Backups findBackups(String backupsId){
        return backupsDao.findBackups(backupsId);
    }


    public List<Backups> findAllBackups(){
        return backupsDao.findAllBackups();
    }

    public Backups findLastBackups(String type){
        BackupsQuery backupsQuery = new BackupsQuery();
        backupsQuery.setType(type);
        List<Backups> allBackups = backupsDao.findBackupsList(backupsQuery);
        if (allBackups.isEmpty()){
            return null;
        }
        allBackups.sort(Comparator.comparing(Backups::getCreateTime).reversed());
        return allBackups.get(0);
    }




}
