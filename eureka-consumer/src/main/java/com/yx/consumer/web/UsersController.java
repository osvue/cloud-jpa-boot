package com.yx.consumer.web;

import com.yx.spring.common.pojo.DataGrid;
import com.yx.spring.common.pojo.Users;
import com.yx.spring.common.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {
    @Autowired
    private UsersService usersService;
    @GetMapping("/user")
    public DataGrid showall(){
        return usersService.selall();
    }
    @GetMapping("/user/{id}")
    public Users selById(@PathVariable Integer id){
        return usersService.findById(id);
    }
}
