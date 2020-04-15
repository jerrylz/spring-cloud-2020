package com.jerrylz.config;

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
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
