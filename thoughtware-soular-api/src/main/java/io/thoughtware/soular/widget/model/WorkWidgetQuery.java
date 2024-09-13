package io.thoughtware.soular.widget.model;

import io.thoughtware.core.page.Page;
public class WorkWidgetQuery {
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
