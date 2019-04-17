package com.demo.springclouddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableDiscoveryClient/*启用服务注册与发现*/
@EnableFeignClients/*启用feign进行远程调用*/
@EnableHystrixDashboard/*Hystrix Dashboard监控*/
@EnableCircuitBreaker/*熔断器*/
public class SpringcloudDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudDemoApplication.class, args);
    }

}
