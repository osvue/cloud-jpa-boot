package com.yx.spring.common.service;

import com.yx.spring.common.pojo.DataGrid;
import com.yx.spring.common.pojo.Users;
import feign.hystrix.FallbackFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class UsersServiceFallback implements FallbackFactory<UsersService> {
    @Override
    public UsersService create(Throwable throwable) {

        return new UsersService() {
            @Override
            public DataGrid selall() {
                DataGrid dataGrid = new DataGrid();
                dataGrid.setCount(100999);
                dataGrid.setMsg("eooro hello");
                return dataGrid;
            }

            @Override
            public Users findById(Integer id) {
                return null;
            }
        };
    }
}
