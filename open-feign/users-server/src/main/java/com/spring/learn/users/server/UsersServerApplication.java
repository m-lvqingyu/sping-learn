package com.spring.learn.users.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Lv.QingYu
 */
@EnableFeignClients(basePackages = "com.spring.learn.order")
@EnableDiscoveryClient
@SpringBootApplication
public class UsersServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(UsersServerApplication.class);
    }

}
