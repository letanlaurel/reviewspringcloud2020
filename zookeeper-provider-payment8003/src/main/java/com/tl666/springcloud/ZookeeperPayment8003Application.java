package com.tl666.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.tl666.springcloud.mapper")
@SpringBootApplication
@EnableDiscoveryClient
public class ZookeeperPayment8003Application {
    public static void main(String[] args){
            SpringApplication.run(ZookeeperPayment8003Application.class,args);
    }
}
