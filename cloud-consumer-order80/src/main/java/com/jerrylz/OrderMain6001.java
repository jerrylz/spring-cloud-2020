package com.jerrylz;

import config.OrderRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author jerrylz
 * @date 2020/4/15
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="cloud-payment-service", configuration = OrderRule.class)
public class OrderMain6001 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain6001.class, args);
    }
}


