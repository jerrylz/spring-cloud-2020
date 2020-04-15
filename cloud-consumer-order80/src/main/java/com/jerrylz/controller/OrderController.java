package com.jerrylz.controller;

import com.jerrylz.entities.CommonResult;
import com.jerrylz.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author jerrylz
 * @date 2020/4/15
 */
@RestController
public class OrderController {

    private static final String PAYMENT_URL = "http://127.0.0.1:8001";
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")
    public CommonResult create(Payment payment){
        return restTemplate.postForObject(PAYMENT_URL + "/payment/create", payment, CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") String id){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id, CommonResult.class);
    }
}
