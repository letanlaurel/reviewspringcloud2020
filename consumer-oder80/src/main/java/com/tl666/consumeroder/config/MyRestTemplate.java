package com.tl666.consumeroder.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: TanLe
 * @Date: 2020/4/25 16:49
 * @Description:
 */
@Configuration
public class MyRestTemplate {

    @LoadBalanced //使用Ribbon的该注解 来赋予RestTemplate负载均衡能力(默认采用轮询算法)
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
