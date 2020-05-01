package com.jerrylz.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jerrylz
 * @date 2020/5/1
 */
@RestController
@RefreshScope
@Slf4j
public class ConfigClientController {
    /**
     * 要访问的3344上的信息
     */

    @Value("${config.info}")
    private String configInfo;

    /**
     * 请求地址
     */
    @GetMapping("/configInfo")
    public String getConfigInfo(){
        return configInfo;
    }
}
