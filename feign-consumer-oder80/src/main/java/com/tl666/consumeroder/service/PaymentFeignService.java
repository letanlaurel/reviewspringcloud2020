package com.tl666.consumeroder.service;

import com.tl666.springcloud.pojo.Payment;
import com.tl666.springcloud.util.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "payment-service")
@RequestMapping("PaymentHandler")
public interface PaymentFeignService {
    @GetMapping("getAll")
    CommonResult getAll();

    @PostMapping("add")
    CommonResult add(@RequestBody Payment payment);
}
