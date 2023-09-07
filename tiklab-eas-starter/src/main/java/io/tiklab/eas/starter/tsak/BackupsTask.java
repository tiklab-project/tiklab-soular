package io.tiklab.eas.starter.tsak;

import io.tiklab.eas.backups.model.EasBackups;
import io.tiklab.eas.backups.service.EasDbBackupsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class BackupsTask {

    @Autowired
    EasDbBackupsService easDbBackupsService;

    @Scheduled(cron = "${eas.backups.time}")
    public void scheduledBackups(){
        EasBackups backupsResult = easDbBackupsService.findBackupsResult();
        Boolean scheduled = backupsResult.getScheduled();
        if (!Objects.isNull(scheduled) && scheduled){
            easDbBackupsService.execBackups();
        }
    }


}
