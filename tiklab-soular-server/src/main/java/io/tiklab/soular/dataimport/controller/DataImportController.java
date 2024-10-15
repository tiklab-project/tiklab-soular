package io.tiklab.soular.dataimport.controller;

import io.tiklab.core.Result;
import io.tiklab.soular.dataimport.model.ImportDatabase;
import io.tiklab.soular.dataimport.model.ImportDateMessage;
import io.tiklab.soular.dataimport.service.DataImportService;
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
@RequestMapping("/data")
public class DataImportController {

    @Autowired
    DataImportService dataImportService;

    @RequestMapping(path="/import",method = RequestMethod.POST)
    public Result<Void> createWorkWidget(@RequestBody @NotNull @Valid ImportDatabase database) {
        dataImportService.dataImport(database);
        return Result.ok();
    }


    @RequestMapping(path="/findImportMessage",method = RequestMethod.POST)
    public Result<ImportDateMessage> findImportMessage() {
        ImportDateMessage importMessage = dataImportService.findImportMessage();
        return Result.ok(importMessage);
    }


}
