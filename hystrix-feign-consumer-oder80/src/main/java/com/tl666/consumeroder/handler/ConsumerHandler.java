package com.tl666.consumeroder.handler;


import com.tl666.consumeroder.service.PaymentFeignService;
import com.tl666.springcloud.pojo.Payment;
import com.tl666.springcloud.util.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: TanLe
 * @Date: 2020/4/22 18:53
 * @Description:
 */
@RestController
@RequestMapping("ConsumerHandler")
@Slf4j
public class ConsumerHandler {

    @Autowired
    PaymentFeignService paymentFeignService;

    @GetMapping("getAll")
    public CommonResult<Payment> getAllPayment(){
        //openfeign-ribbon客户端一般默认等待1秒钟，如果1秒后没得到服务提供方的响应，就会报错
        CommonResult all = paymentFeignService.getAll();
        return all;
    }

    @GetMapping("getTimeOutAll")
    public CommonResult<Payment> getTimeOutAllPayment(){
        //openfeign-ribbon客户端一般默认等待1秒钟，如果1秒后没得到服务提供方的响应，就会报错
        CommonResult all = paymentFeignService.getTimeOutAll();
        return all;
    }

    @PostMapping("addPayment")
    public CommonResult<Payment> addPayment(Payment payment){
        log.info(payment.toString());
        return paymentFeignService.add(payment);
    }
}
