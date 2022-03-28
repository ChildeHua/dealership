package com.chd.dealership.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.chd.dealership.product.feign")
@MapperScan("com.chd.dealership.product.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class DealershipProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(DealershipProductApplication.class, args);
    }

}
