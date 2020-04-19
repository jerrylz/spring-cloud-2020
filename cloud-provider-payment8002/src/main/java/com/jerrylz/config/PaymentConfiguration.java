package com.jerrylz.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author jerrylz
 * @date 2020/4/15
 */
@Configuration
@MapperScan("com.jerrylz.dao")
public class PaymentConfiguration {
}
