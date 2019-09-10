package com.yx.spring.eurekaprovider8001.mapper;

import com.yx.spring.common.pojo.Users;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface UsersMapper {
    @Select("select * from users")
    List<Users> findAll();
    @Select("select count(uid) from users")
    long count();
    @Select("select * from users where uid = #{param1}")
    Users getOne(Integer id);
}
