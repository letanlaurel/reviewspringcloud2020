package com.tl666.springcloud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: TanLe
 * @Date: 2020/4/22 18:56
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private Integer id;
    private String serial;
}
