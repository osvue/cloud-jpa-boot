package com.yx.vue.repository;

import com.yx.spring.common.pojo.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UsersRepository extends JpaRepository<Users,Integer> , JpaSpecificationExecutor<Users> {
}
