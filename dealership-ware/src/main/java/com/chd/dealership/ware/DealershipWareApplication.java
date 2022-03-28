package com.chd.dealership.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@MapperScan("com.chd.dealership.ware.dao")
@SpringBootApplication
public class DealershipWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(DealershipWareApplication.class, args);
    }

}
