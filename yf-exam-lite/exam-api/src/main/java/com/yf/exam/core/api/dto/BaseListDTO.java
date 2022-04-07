package com.yf.exam.core.api.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 请求和响应的基础类，用于处理序列化
 * @author dav
 *
 */
@Data
public class BaseListDTO<T> implements Serializable {

    @JsonIgnore
    private String userId;

    /**
     * 数据列表
     */
    private List<T> items;
}
