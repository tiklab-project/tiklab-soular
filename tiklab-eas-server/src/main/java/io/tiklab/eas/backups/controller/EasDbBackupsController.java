package io.tiklab.eas.backups.controller;

import io.tiklab.core.Result;
import io.tiklab.eas.backups.model.EasBackups;
import io.tiklab.eas.backups.service.EasDbBackupsService;
import io.tiklab.eas.dataimport.model.ImportDatabase;
import io.tiklab.eas.dataimport.model.ImportDateMessage;
import io.tiklab.eas.dataimport.service.DataImportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * 导入数据控制器
 * @author admin
 */

@RestController
@RequestMapping("/eas/backups")
public class EasDbBackupsController {

    @Autowired
    EasDbBackupsService easDbBackupsService;

    @RequestMapping(path="/backups",method = RequestMethod.POST)
    public Result<Void> createWorkWidget() {
        easDbBackupsService.execBackups();
        return Result.ok();
    }


    @RequestMapping(path="/findBackups",method = RequestMethod.POST)
    public Result<EasBackups> findImportMessage() {
        EasBackups backupsResult = easDbBackupsService.findBackupsResult();
        return Result.ok(backupsResult);
    }


    @RequestMapping(path="/updateBackups",method = RequestMethod.POST)
    public Result<Void> createWorkWidget(@NotNull Boolean scheduled) {
        easDbBackupsService.updateBackups(scheduled);
        return Result.ok();
    }


}
