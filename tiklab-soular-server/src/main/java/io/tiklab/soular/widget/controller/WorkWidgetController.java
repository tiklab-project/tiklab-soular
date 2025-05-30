package io.tiklab.soular.widget.controller;

import io.tiklab.core.Result;
import io.tiklab.core.page.Pagination;
import io.tiklab.postin.annotation.Api;
import io.tiklab.postin.annotation.ApiMethod;
import io.tiklab.postin.annotation.ApiParam;
import io.tiklab.soular.widget.model.WorkWidget;
import io.tiklab.soular.widget.model.WorkWidgetQuery;
import io.tiklab.soular.widget.service.WorkWidgetService;
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

@RestController
@RequestMapping("/widget")
@Api(name = "工作台应用控制器",desc = "工作台应用控制器")
public class WorkWidgetController {
    private static Logger logger = LoggerFactory.getLogger(WorkWidgetController.class);

    @Autowired
    private WorkWidgetService workWidgetService;

    @RequestMapping(path="/createWorkWidget",method = RequestMethod.POST)
    @ApiMethod(name = "创建配置的应用",desc = "创建配置的应用")
    @ApiParam(name = "workWidget",desc = "应用信息",required = true)
    public Result<String> createWorkWidget(@RequestBody @NotNull @Valid WorkWidget workWidget) {
        String id = workWidgetService.createWorkWidget(workWidget);
        return Result.ok(id);
    }


    @RequestMapping(path="/updateWorkWidget",method = RequestMethod.POST)
//   // //@ApiMethod(name = "updateWorkWidget",desc = "updateWorkWidget")
//   // //@ApiParam(name = "workWidget",desc = "workWidget",required = true)
    public Result<Void> updateWorkWidget(@RequestBody @NotNull @Valid WorkWidget workWidget) {
         workWidgetService.updateWorkWidget(workWidget);
        return Result.ok();
    }

    @RequestMapping(path="/deleteWorkWidget",method = RequestMethod.POST)
    @ApiMethod(name = "删除配置的应用",desc = "查询配置的应用")
    @ApiParam(name = "id",desc = "id",required = true)
    public Result<Void> deleteWorkWidget(@NotNull String id) {
        workWidgetService.deleteWorkWidget(id);
        return Result.ok();
    }


    @RequestMapping(path="/findWorkWidgetList",method = RequestMethod.POST)
    @ApiMethod(name = "查询的应用列表",desc = "查询配置的应用")
    @ApiParam(name = "workWidgetQuery",desc = "workWidgetQuery",required = true)
    public Result<WorkWidget> findWorkWidgetList(@RequestBody @NotNull @Valid WorkWidgetQuery workWidgetQuery) {
        List<WorkWidget> workWidgetAll = workWidgetService.findWorkWidgetAll(workWidgetQuery);
        return Result.ok(workWidgetAll);
    }


    @RequestMapping(path="/findWorkWidgetPage",method = RequestMethod.POST)
    @ApiMethod(name = "分页查询的应用列表",desc = "分页查询的应用列表")
    @ApiParam(name = "workWidgetQuery",desc = "workWidgetQuery",required = true)
    public Result<Pagination<WorkWidget>> findWorkWidgetPage(@RequestBody @NotNull @Valid WorkWidgetQuery workWidgetQuery) {
        Pagination<WorkWidget>  workWidgetAll = workWidgetService.findWorkWidgetPage(workWidgetQuery);
        return Result.ok(workWidgetAll);
    }
}
