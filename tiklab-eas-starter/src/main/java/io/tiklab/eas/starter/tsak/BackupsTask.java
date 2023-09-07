package io.tiklab.eas.starter.tsak;

import io.tiklab.eas.backups.model.EasBackups;
import io.tiklab.eas.backups.service.EasDbBackupsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class BackupsTask {

    private static final Logger logger = LoggerFactory.getLogger(BackupsTask.class);


    @Autowired
    EasDbBackupsService easDbBackupsService;

    @Scheduled(cron = "${eas.backups.time}")
    public void scheduledBackups(){
        logger.info("Eas备份定时任务被触发......");
        EasBackups backupsResult = easDbBackupsService.findBackupsResult();
        Boolean scheduled = backupsResult.getScheduled();

        if (!Objects.isNull(scheduled) && scheduled ){
            logger.info("应用开启定时备份......");
            easDbBackupsService.execBackups();
        }else {
            logger.info("应用未开启定时备份......");
        }
    }
}
