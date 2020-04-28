package com.tl666.balancerule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: TanLe
 * @Date: 2020/4/25 16:55
 * @Description:
 */
@Configuration
public class MyBalancerule {

    @Bean
    public IRule iRule(){
        return new RandomRule();  //将默认轮询算法改为随机算法
    }
}
