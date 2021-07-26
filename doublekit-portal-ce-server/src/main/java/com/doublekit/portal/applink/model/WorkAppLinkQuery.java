package com.doublekit.portal.applink.model;

import com.doublekit.apibox.annotation.ApiModel;
import com.doublekit.apibox.annotation.ApiProperty;
import com.doublekit.dal.jpa.criteria.annotation.CriteriaQuery;
import com.doublekit.dal.jpa.criteria.annotation.OrderField;
import com.doublekit.dal.jpa.criteria.annotation.PageField;
import com.doublekit.dal.jpa.criteria.model.OrderParam;
import com.doublekit.dal.jpa.criteria.model.Orders;
import com.doublekit.dal.jpa.criteria.model.PageParam;

import java.util.List;

@ApiModel
@CriteriaQuery
public class WorkAppLinkQuery {

    @ApiProperty(name ="orderParams",desc = "排序参数")
    @OrderField
    private List<OrderParam> orderParams = Orders.instance().desc("sort").get();

    @ApiProperty(name ="pageParam",desc = "分页参数")
    @PageField
    private PageParam pageParam = new PageParam();

    public List<OrderParam> getOrderParams() {
        return orderParams;
    }

    public void setOrderParams(List<OrderParam> orderParams) {
        this.orderParams = orderParams;
    }

    public PageParam getPageParam() {
        return pageParam;
    }

    public void setPageParam(PageParam pageParam) {
        this.pageParam = pageParam;
    }
}