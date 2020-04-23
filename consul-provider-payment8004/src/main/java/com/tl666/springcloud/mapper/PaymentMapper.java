package com.tl666.springcloud.mapper;

import com.tl666.springcloud.pojo.Payment;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Auther: TanLe
 * @Date: 2020/4/22 17:33
 * @Description:
 */
public interface PaymentMapper {

    boolean addPayment(Payment payment);

    boolean delPayment(Integer id);

    boolean updatePayment(Payment payment);

    @Select("select * from payment")
    List<Payment> selectAllPayment();
}
