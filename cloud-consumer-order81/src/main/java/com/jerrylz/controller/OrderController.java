package com.jerrylz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author jerrylz
 * @date 2020/4/20
 */
@RestController
public class OrderController {
    private final static String PAYMENT_URL = "http://cloud-payment-server";
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/zk")
    public String getInfo(){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/zk", String.class);
    }
}
