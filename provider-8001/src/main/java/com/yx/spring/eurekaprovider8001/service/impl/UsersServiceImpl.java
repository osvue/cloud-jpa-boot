package com.yx.spring.eurekaprovider8001.service.impl;

import com.yx.spring.common.pojo.DataGrid;
import com.yx.spring.common.pojo.Users;
import com.yx.spring.eurekaprovider8001.mapper.UsersMapper;
import com.yx.spring.eurekaprovider8001.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersMapper usersRepository;
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
