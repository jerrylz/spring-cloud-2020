package com.jerrylz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author jerrylz
 * @date 2020/4/24
 */
@SpringBootApplication
@EnableFeignClients
public class FeignOrderMain6001 {
    public static void main(String[] args) {
        SpringApplication.run(FeignOrderMain6001.class, args);
    }
}
