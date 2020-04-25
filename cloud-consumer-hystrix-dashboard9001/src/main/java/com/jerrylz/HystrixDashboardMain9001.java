package com.jerrylz;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;

/**
 * @author jerrylz
 * @date 2020/4/25
 */
@SpringBootApplication
@EnableHystrixDashboard
@Slf4j
public class HystrixDashboardMain9001 {
    public static void main(String[] args) {
        String s = IdUtil.simpleUUID();
        log.info(s);
        SpringApplication.run(HystrixDashboardMain9001.class, args);
    }




}
