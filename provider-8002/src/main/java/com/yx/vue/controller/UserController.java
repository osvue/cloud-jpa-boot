package com.yx.vue.controller;

import com.yx.spring.common.pojo.DataGrid;
import com.yx.spring.common.pojo.Users;
import com.yx.vue.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController  {
    @Autowired
    private UsersService usersService;
    @GetMapping("/user")
    public DataGrid selall(){
        return  usersService.show();
    }
    @GetMapping("/user/{id}")
    public Users findById(@PathVariable Integer id){
        return usersService.selById(id);
    }
}
