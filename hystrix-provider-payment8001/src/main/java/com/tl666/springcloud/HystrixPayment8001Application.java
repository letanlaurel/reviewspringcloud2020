package com.tl666.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@MapperScan("com.tl666.springcloud.mapper")
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class HystrixPayment8001Application {
    public static void main(String[] args){
            SpringApplication.run(HystrixPayment8001Application.class,args);
    }
}
