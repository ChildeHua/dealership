package com.chd.dealership.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@MapperScan("com.chd.dealership.coupon.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class DealershipCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(DealershipCouponApplication.class, args);
    }

}
