package com.jerrylz.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author jerrylz
 * @date 2020/4/15
 */
@Configuration
public class OrderConfiguration {

    @Bean
//    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @Bean
    public LoadBalance getLoadBalance(){
        return new MyLB();
    }
}
