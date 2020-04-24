package com.jerrylz.config;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author jerrylz
 * @date 2020/4/24
 */
public interface LoadBalance {
    ServiceInstance getInstance(List<ServiceInstance> instanceList);
}
