package io.tiklab.eas.backups.controller;

import io.tiklab.core.Result;
import io.tiklab.core.exception.SystemException;
import io.tiklab.eas.backups.model.EasBackups;
import io.tiklab.eas.backups.service.EasDbBackupsService;
import io.tiklab.eas.backups.service.EasDbRestoreService;
import io.tiklab.eas.dataimport.model.ImportDatabase;
import io.tiklab.eas.dataimport.model.ImportDateMessage;
import io.tiklab.eas.dataimport.service.DataImportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.IOException;
import java.io.InputStream;

/**
 * 导入数据控制器
 * @author admin
 */

@RestController
@RequestMapping("/eas/backups")
public class EasDbBackupsController {

    @Autowired
    EasDbBackupsService easDbBackupsService;

    @Autowired
    EasDbRestoreService easDbRestoreService;

    @RequestMapping(path="/backups",method = RequestMethod.POST)
    public Result<Void> createWorkWidget() {
        easDbBackupsService.execBackups();
        return Result.ok();
    }


    @RequestMapping(path="/findBackups",method = RequestMethod.POST)
    public Result<EasBackups> findBackups() {
        EasBackups backupsResult = easDbBackupsService.findBackupsResult();
        return Result.ok(backupsResult);
    }


    @RequestMapping(path="/updateBackups",method = RequestMethod.POST)
    public Result<Void> updateBackups(@NotNull Boolean scheduled) {
        easDbBackupsService.updateBackups(scheduled);
        return Result.ok();
    }


    @RequestMapping(path="/uploadBackups",method = RequestMethod.POST)
    public Result<String> uploadBackups(@RequestParam("uploadFile") MultipartFile uploadFile){
        String string;
        try {
            String fileName = uploadFile.getOriginalFilename();   //获取文件名字
            InputStream inputStream = uploadFile.getInputStream();
            string = easDbRestoreService.uploadBackups(fileName, inputStream);
        } catch (IOException e) {
            throw new SystemException(e);
        }
        return Result.ok(string);
    }

    @RequestMapping(path="/restore",method = RequestMethod.POST)
    public Result<Void> execRestore(@NotNull String path) {
        easDbRestoreService.execRestore(path);
        return Result.ok();
    }


    @RequestMapping(path="/findRestore",method = RequestMethod.POST)
    public Result<EasBackups> findRestoreResult() {
        EasBackups backupsResult = easDbRestoreService.findRestoreResult();
        return Result.ok(backupsResult);
    }


}
