package com.jerrylz.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author jerrylz
 * @date 2020/4/25
 */
@Configuration
public class FeignOrderConfiguration {

    @Bean
    public Logger.Level getLogLevel(){
        return Logger.Level.FULL;
    }
}
