package com.chd.dealership.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.chd.dealership.product.dao")
@SpringBootApplication
public class DealershipProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(DealershipProductApplication.class, args);
    }

}
