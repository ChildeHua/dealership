package com.chd.dealership.thirdparty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DealershipThirdPartyApplication {

    public static void main(String[] args) {
        SpringApplication.run(DealershipThirdPartyApplication.class, args);
    }

}
