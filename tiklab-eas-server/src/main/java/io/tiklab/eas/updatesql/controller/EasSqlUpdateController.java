package io.tiklab.eas.updatesql.controller;

import io.tiklab.core.Result;
import io.tiklab.eas.updatesql.service.EasSqlUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sql")
public class EasSqlUpdateController {

    @Autowired
    private EasSqlUpdateService easSqlUpdateService;


    @RequestMapping(path = "/update",method = RequestMethod.POST)
    //@ApiMethod(name = "createUser",desc = "创建用户")
    //@ApiParam(name = "user",desc = "用户DTO",required = true)
    public Result<String> createUser() {
        easSqlUpdateService.updateSqlUuid();
        return Result.ok();
    }

}
