package io.thoughtware.eas.widget.controller;

import io.thoughtware.core.Result;
import io.thoughtware.eas.widget.model.WorkWidgetLayout;
import io.thoughtware.eas.widget.service.WorkWidgetLayoutService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/widgetLayout")
////@Api(name = "WorkWidgetLayoutController",desc = "用户工作台布局")
public class WorkWidgetLayoutController {
    private static Logger logger = LoggerFactory.getLogger(WorkWidgetLayoutController.class);


    @Autowired
    private WorkWidgetLayoutService workWidgetLayoutService;


    @RequestMapping(path="/createLayout",method = RequestMethod.POST)
//   // @ApiParam(name = "workWidget",desc = "workWidget",required = true)
    public Result<String> createLayout(@RequestBody @NotNull @Valid WorkWidgetLayout workWidgetLayout) {
        String id = workWidgetLayoutService.createWidgetLayout(workWidgetLayout);
        return Result.ok(id);
    }


    @RequestMapping(path="/updateLayout",method = RequestMethod.POST)
//   // @ApiParam(name = "workWidget",desc = "workWidget",required = true)
    public Result<String> updateLayout(@RequestBody @NotNull @Valid WorkWidgetLayout workWidgetLayout) {
        workWidgetLayoutService.updateWidgetLayout(workWidgetLayout);
        return Result.ok();
    }


//    @RequestMapping(path="/findLayout",method = RequestMethod.POST)
//   // @ApiParam(name = "workWidget",desc = "workWidget",required = true)
//    public Result<WorkWidgetLayout> findLayout(@RequestBody @NotNull @Valid WorkWidgetLayoutQuery workWidgetLayoutQuery) {
//        WorkWidgetLayout widgetLayout = workWidgetLayoutService.findWidgetLayout(workWidgetLayoutQuery);
//        return Result.ok(widgetLayout);
//    }

    @RequestMapping(path="/findLayout",method = RequestMethod.POST)
//   // @ApiParam(name = "workWidget",desc = "所有用户只有一个工作空间",required = true)
    public Result<WorkWidgetLayout> findLayout() {
        WorkWidgetLayout widgetLayout = workWidgetLayoutService.findWidgetLayoutOne();
        return Result.ok(widgetLayout);
    }
}
