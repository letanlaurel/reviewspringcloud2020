package com.tl666.consumeroder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: TanLe
 * @Date: 2020/4/22 18:52
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class ConsumerApplication {
    public static void main(String[] args){
            SpringApplication.run(ConsumerApplication.class,args);
    }

    @LoadBalanced //使用Ribbon的该注解 来赋予RestTemplate负载均衡能力
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
