package com.gsd.ubuntumall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@MapperScan("com.gsd.ubuntumall.member.dao")
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.gsd.ubuntumall.member.feign")
public class UbuntumailMemberApplication {
    public static void main(String[] args) {
        SpringApplication.run(UbuntumailMemberApplication.class, args);
    }

}
