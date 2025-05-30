package io.tiklab.soular.widget.model;

import io.tiklab.core.page.Page;
import io.tiklab.postin.annotation.ApiProperty;

public class WorkWidgetQuery {


    @ApiProperty(name ="type",desc = "类型")
    private String type;

    @ApiProperty(name ="pageParam",desc = "分页参数")
    private Page pageParam = new Page();

    public Page getPageParam() {
        return pageParam;
    }

    public void setPageParam(Page pageParam) {
        this.pageParam = pageParam;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }



}
