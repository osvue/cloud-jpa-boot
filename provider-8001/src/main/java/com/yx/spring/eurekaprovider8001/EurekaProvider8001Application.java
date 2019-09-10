package com.yx.spring.eurekaprovider8001;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient          //服务注册的客户端
@MapperScan(basePackages = {"com.yx.spring.eurekaprovider8001.mapper"})
public class EurekaProvider8001Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProvider8001Application.class, args);
    }

}
