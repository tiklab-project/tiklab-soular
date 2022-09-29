package net.tiklab.eas.widget.model;

import net.tiklab.core.page.Page;
import net.tiklab.postin.annotation.ApiModel;
import net.tiklab.postin.annotation.ApiProperty;
@ApiModel
public class WorkWidgetQuery {
    @ApiProperty(name="type",desc="所属项目",required = true)
    private String type;

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
