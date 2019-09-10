package com.yx.vue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 服务提供者
 */
@SpringBootApplication
@EnableDiscoveryClient
@EntityScan(basePackages = {"com.yx.spring.common.pojo"})       //解决实体类的扫描不到问题
public class Consumer2App {
    public static void main(String[] args) {
        SpringApplication.run(Consumer2App.class,args);

    }

}
