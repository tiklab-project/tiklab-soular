package com.tiklab.eas.applink.controller;

import com.tiklab.postin.annotation.Api;
import com.tiklab.postin.annotation.ApiMethod;
import com.tiklab.postin.annotation.ApiParam;
import com.tiklab.core.Result;
import com.tiklab.core.page.Pagination;
import com.tiklab.eas.applink.model.WorkAppLink;
import com.tiklab.eas.applink.model.WorkAppLinkQuery;
import com.tiklab.eas.applink.service.WorkAppLinkService;
//import com.tiklab.toolkit.sort.model.Exchange;
//import com.tiklab.toolkit.sort.service.SortService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * ManagerController
 * Created by Zhangzhihua on 2017/9/25.
 */
@RestController
@RequestMapping("/workAppLink")
@Api(name = "WorkAppLinkController",desc = "工作台应用链接管理")
public class WorkAppLinkController {

    private static Logger logger = LoggerFactory.getLogger(WorkAppLinkController.class);

    @Autowired
    private WorkAppLinkService workAppLinkService;

//    @Autowired
//    private SortService sortService;

    @RequestMapping(path="/createWorkAppLink",method = RequestMethod.POST)
    @ApiMethod(name = "createWorkAppLink",desc = "createWorkAppLink")
    @ApiParam(name = "workAppLink",desc = "workAppLink",required = true)
    public Result<String> createWorkAppLink(@RequestBody @NotNull @Valid WorkAppLink workAppLink){
        String id = workAppLinkService.createWorkAppLink(workAppLink);

        return Result.ok(id);
    }

    @RequestMapping(path="/updateWorkAppLink",method = RequestMethod.POST)
    @ApiMethod(name = "updateWorkAppLink",desc = "updateWorkAppLink")
    @ApiParam(name = "workAppLink",desc = "workAppLink",required = true)
    public Result<Void> updateWorkAppLink(@RequestBody @NotNull @Valid WorkAppLink workAppLink){
        workAppLinkService.updateWorkAppLink(workAppLink);

        return Result.ok();
    }

    @RequestMapping(path="/deleteWorkAppLink",method = RequestMethod.POST)
    @ApiMethod(name = "deleteWorkAppLink",desc = "deleteWorkAppLink")
    @ApiParam(name = "id",desc = "id",required = true)
    public Result<Void> deleteWorkAppLink(@NotNull String id){
        workAppLinkService.deleteWorkAppLink(id);

        return Result.ok();
    }

    @RequestMapping(path="/findWorkAppLink",method = RequestMethod.POST)
    @ApiMethod(name = "findWorkAppLink",desc = "findWorkAppLink")
    @ApiParam(name = "id",desc = "id",required = true)
    public Result<WorkAppLink> findWorkAppLink(@NotNull String id){
        WorkAppLink workAppLink = workAppLinkService.findWorkAppLink(id);

        return Result.ok(workAppLink);
    }

    @RequestMapping(path="/findAllWorkAppLink",method = RequestMethod.POST)
    @ApiMethod(name = "findAllWorkAppLink",desc = "findAllWorkAppLink")
    public Result<List<WorkAppLink>> findAllWorkAppLink(){
        List<WorkAppLink> workAppLinkList = workAppLinkService.findAllWorkAppLink();

        return Result.ok(workAppLinkList);
    }


    @RequestMapping(path = "/findWorkAppLinkList",method = RequestMethod.POST)
    @ApiMethod(name = "findWorkAppLinkList",desc = "findWorkAppLinkList")
    @ApiParam(name = "workAppLinkQuery",desc = "workAppLinkQuery",required = true)
    public Result<List<WorkAppLink>> findWorkAppLinkList(@RequestBody @Valid @NotNull WorkAppLinkQuery workAppLinkQuery){
        List<WorkAppLink> workAppLinkList = workAppLinkService.findWorkAppLinkList(workAppLinkQuery);

        return Result.ok(workAppLinkList);
    }


    @RequestMapping(path = "/findWorkAppLinkPage",method = RequestMethod.POST)
    @ApiMethod(name = "findWorkAppLinkPage",desc = "findWorkAppLinkPage")
    @ApiParam(name = "workAppLinkQuery",desc = "workAppLinkQuery",required = true)
    public Result<Pagination<WorkAppLink>> findWorkAppLinkPage(@RequestBody @Valid @NotNull WorkAppLinkQuery workAppLinkQuery){
        Pagination<WorkAppLink> pagination = workAppLinkService.findWorkAppLinkPage(workAppLinkQuery);

        return Result.ok(pagination);
    }

//    @RequestMapping(path="/exchange",method = RequestMethod.POST)
//    @ApiMethod(name = "exchange",desc = "交换排序")
//    @ApiParam(name = "exchange",desc = "交换排序DTO",required = true)
//    public Result<Void> exchange(@RequestBody @Valid @NotNull Exchange exchange){
//        sortService.exchange("orc_work_app_link","id","sort",exchange);
//
//        return Result.ok();
//    }

}
