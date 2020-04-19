package com.jerrylz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author jerrylz
 * @date 2020/4/15
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderMain6001 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain6001.class, args);
    }
}


