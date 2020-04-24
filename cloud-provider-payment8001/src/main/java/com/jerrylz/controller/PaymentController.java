package com.jerrylz.controller;

import com.jerrylz.entities.CommonResult;
import com.jerrylz.entities.Payment;
import com.jerrylz.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author jerrylz
 * @date 2020/4/14
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String port;
    @Resource
    private PaymentService paymentService;

    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping("/payment/create")
    public CommonResult<Integer> create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info(">>>>>插入结果:{}", result);
        if(result > 0){
            return new CommonResult<>(200, "添加成功"+port, result);
        }
        return new CommonResult<>(444, "添加失败", null);
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info(">>>>查询结果:{}", payment);
        if(payment != null){
            return new CommonResult<>(200, "查询成功" + port, payment);
        }
        return new CommonResult<>(444, "未查到数据", null);

    }

    @GetMapping("/payment/discovery")
    public Object discovery(){
        return discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
    }

    @GetMapping("/payment/port")
    public String getPort(){
        return this.port;
    }
}
