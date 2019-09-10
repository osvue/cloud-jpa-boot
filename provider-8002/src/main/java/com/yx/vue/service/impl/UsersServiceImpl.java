package com.yx.vue.service.impl;

import com.yx.spring.common.pojo.DataGrid;
import com.yx.spring.common.pojo.Users;
import com.yx.vue.repository.UsersRepository;
import com.yx.vue.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.PipedReader;
import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    UsersRepository usersRepository;
    public DataGrid show() {
        List<Users> all = usersRepository.findAll();
        long count = usersRepository.count();
        DataGrid dataGrid = new DataGrid();
        dataGrid.setCount(count);
        dataGrid.setData(all);
        return dataGrid;
    }

    @Override
    public Users selById(Integer id) {
        return usersRepository.getOne(id);
    }
}
