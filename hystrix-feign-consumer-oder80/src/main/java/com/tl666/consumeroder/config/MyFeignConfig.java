package com.tl666.consumeroder.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: TanLe
 * @Date: 2020/4/27 12:40
 * @Description:
 */
@Configuration
public class MyFeignConfig {

    @Bean
    Logger.Level level(){
        return Logger.Level.FULL;
    }
}
