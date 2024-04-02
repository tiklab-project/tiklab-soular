package io.thoughtware.eas.count.controller;

import io.thoughtware.core.Result;
import io.thoughtware.eas.count.EasCountService;
import io.thoughtware.eas.dataimport.model.ImportDatabase;
import io.thoughtware.eas.dataimport.model.ImportDateMessage;
import io.thoughtware.eas.dataimport.service.DataImportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Map;
import java.util.Objects;

/**
 * 导入数据控制器
 * @author admin
 */

@RestController
@RequestMapping("/count")
public class EasCountController {

    @Autowired
    EasCountService easCountService;

    @RequestMapping(path="/findCount",method = RequestMethod.POST)
    public Result<Map<String, Object>> createWorkWidget() {
        Map<String, Object> count = easCountService.findCount();
        return Result.ok(count);
    }


}
