package com.tl666.springcloud.handler;

import com.tl666.springcloud.pojo.Payment;
import com.tl666.springcloud.service.PaymentService;
import com.tl666.springcloud.util.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: TanLe
 * @Date: 2020/4/22 17:46
 * @Description:
 */
@RestController
@RequestMapping("PaymentHandler")
@Slf4j
public class PaymentHandler {

    @Autowired
    PaymentService paymentService;

    @Value("${server.port}")
    String serverPort;

    @Resource
    DiscoveryClient discoveryClient;

    @PostMapping("add")
    public CommonResult add(@RequestBody Payment payment){
        log.info(payment.toString());
        boolean b = paymentService.addPaymentService(payment);
        if(b){
            return new CommonResult(200,"添加成功,serverPort:"+serverPort,b);
        }
        return new CommonResult(444,"添加失败,serverPort:"+serverPort,b);
    }

    @GetMapping("getAll")
    public CommonResult getAll(){
        List<Payment> list =  paymentService.selectAllPaymentService();
        if(list == null || list.size() == 0)
            return new CommonResult(444,"没有查询到任何记录,serverPort:"+serverPort,null);
        return new CommonResult(200,"查询成功,serverPort:"+serverPort,list);
    }

    @GetMapping("discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        services.stream().forEach(System.out::println);
        System.out.println("*************************");
        List<ServiceInstance> instances = discoveryClient.getInstances("payment-service");
        for (ServiceInstance instance : instances) {
            System.out.println(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
        }
        return discoveryClient;
    }
}
