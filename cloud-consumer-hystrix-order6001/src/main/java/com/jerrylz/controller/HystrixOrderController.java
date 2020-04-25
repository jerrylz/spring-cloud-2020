package com.jerrylz.controller;

import com.jerrylz.entities.CommonResult;
import com.jerrylz.entities.Payment;
import com.jerrylz.service.HystrixOrderService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author jerrylz
 * @date 2020/4/24
 */
@RestController
@Slf4j
public class HystrixOrderController {

    @Resource
    private HystrixOrderService feignOrderService;
    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentBuId(@PathVariable("id") Long id){
        return feignOrderService.getPaymentById(id);
    }

    @GetMapping("/consumer/payment/get/timeout")
    public String readTimeOut() {
        return feignOrderService.readTimeOut();
    }

    @HystrixCommand(fallbackMethod = "hasExceptionHystrix", commandProperties = {
            @HystrixProperty(name="circuitBreaker.enabled", value = "true"),
            @HystrixProperty(name="circuitBreaker.requestVolumeThreshold", value = "10"),
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"),
            @HystrixProperty(name="circuitBreaker.errorThresholdPercentage", value = "60")
    })
    @GetMapping("/consumer/payment/hystrix/{id}")
    public String hasException(@PathVariable("id") Long id){
        if(id < 0){
            int a = 1/0;
        }
        return ">>>>>>>ok";
    }

    public String hasExceptionHystrix(Long id){
        return ">>>>>hystrix 熔断";
    }
}
