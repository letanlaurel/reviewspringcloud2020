package com.tl666.consumeroder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: TanLe
 * @Date: 2020/4/22 18:52
 * @Description: 通过Consul来实现注册中心对服务进行管理
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulConsumerApplication {
    public static void main(String[] args){
            SpringApplication.run(ConsulConsumerApplication.class,args);
    }

    @LoadBalanced //使用Ribbon的该注解 来赋予RestTemplate负载均衡能力
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
