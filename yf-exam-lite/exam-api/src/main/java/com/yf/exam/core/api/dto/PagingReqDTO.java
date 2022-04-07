package com.yf.exam.core.api.dto;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 分页查询类
 * @param <T>
 * @author bool
 */
@ApiModel(value="分页参数", description="分页参数")
@Data
public class PagingReqDTO<T> {


    @ApiModelProperty(value = "当前页码", required = true, example = "1")
    private Integer current;

    @ApiModelProperty(value = "每页数量", required = true, example = "10")
    private Integer size;

    @ApiModelProperty(value = "查询参数")
    private T params;

    @ApiModelProperty(value = "排序字符")
    private String orderBy;

    @JsonIgnore
    @ApiModelProperty(value = "当前用户的ID")
    private String userId;

    /**
     * 转换成MyBatis的简单分页对象
     * @return
     */
    public Page toPage(){
        Page page = new Page();
        page.setCurrent(this.current);
        page.setSize(this.size);
        return page;
    }

    public Integer getCurrent() {
        return current;
    }

    public void setCurrent(Integer current) {
        this.current = current;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public T getParams() {
        return params;
    }

    public void setParams(T params) {
        this.params = params;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
