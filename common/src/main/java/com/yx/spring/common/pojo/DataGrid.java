package com.yx.spring.common.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * LayUI 返回值
 */
@Data
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class DataGrid implements Serializable {

    private List<?> data;
    private String msg ="";
    private  long count;
    private Integer code = 200;

}
