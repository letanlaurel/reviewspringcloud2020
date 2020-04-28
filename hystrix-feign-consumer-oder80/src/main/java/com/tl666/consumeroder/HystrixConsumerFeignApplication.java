package com.tl666.consumeroder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Auther: TanLe
 * @Date: 2020/4/22 18:52
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class HystrixConsumerFeignApplication {
    public static void main(String[] args){
            SpringApplication.run(HystrixConsumerFeignApplication.class,args);
    }
}
