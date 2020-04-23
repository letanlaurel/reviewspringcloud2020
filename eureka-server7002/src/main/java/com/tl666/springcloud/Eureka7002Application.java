package com.tl666.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Auther: TanLe
 * @Date: 2020/4/23 10:17
 * @Description:
 */
@EnableEurekaServer
@SpringBootApplication
public class Eureka7002Application {
    public static void main(String[] args){
            SpringApplication.run(Eureka7002Application.class,args);
    }
}
