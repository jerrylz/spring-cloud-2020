package com.jerrylz.service;

import com.jerrylz.entities.CommonResult;
import com.jerrylz.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author jerrylz
 * @date 2020/4/24
 */
@Component
@FeignClient("cloud-payment-service")
public interface IFeignOrderService {

    @GetMapping("/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping("/payment/get/timeout")
    public String readTimeOut();
}
