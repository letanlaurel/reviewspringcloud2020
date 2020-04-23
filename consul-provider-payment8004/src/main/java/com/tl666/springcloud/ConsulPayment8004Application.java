package com.tl666.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 通过Consul来实现注册中心对服务进行管理
 */
@MapperScan("com.tl666.springcloud.mapper")
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulPayment8004Application {
    public static void main(String[] args){
            SpringApplication.run(ConsulPayment8004Application.class,args);
    }
}
