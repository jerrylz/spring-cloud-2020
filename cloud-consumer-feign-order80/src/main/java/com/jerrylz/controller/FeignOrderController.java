package com.jerrylz.controller;

import com.jerrylz.entities.CommonResult;
import com.jerrylz.entities.Payment;
import com.jerrylz.service.IFeignOrderService;
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
public class FeignOrderController {

    @Resource
    private IFeignOrderService feignOrderService;
    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentBuId(@PathVariable("id") Long id){
        return feignOrderService.getPaymentById(id);
    }

    @GetMapping("/consumer/payment/get/timeout")
    public String readTimeOut() {
        return feignOrderService.readTimeOut();
    }
}
