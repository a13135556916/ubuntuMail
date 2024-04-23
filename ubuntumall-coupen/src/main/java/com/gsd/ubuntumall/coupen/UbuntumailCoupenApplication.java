package com.gsd.ubuntumall.coupen;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@MapperScan("com.gsd.ubuntumall.coupen.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class UbuntumailCoupenApplication {

    //发大水发
    public static void main(String[] args) {
        SpringApplication.run(UbuntumailCoupenApplication.class, args);
    }

}
