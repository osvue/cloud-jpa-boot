package com.yx.spring.common.service;

import com.yx.spring.common.pojo.DataGrid;
import com.yx.spring.common.pojo.Users;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 接口
 */
@FeignClient(value = "EUREKA-SERVER-PROVIDER",fallbackFactory = UsersServiceFallback.class)
public interface UsersService {

    @GetMapping("/user")
    public DataGrid selall();
    @GetMapping("/user/{id}")
    public Users findById(@PathVariable(value = "id") Integer id);


}
