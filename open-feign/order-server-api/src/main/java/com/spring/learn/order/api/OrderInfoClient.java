package com.spring.learn.order.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description: <pre>
 * </pre>
 * @author: Lvqingyu
 * @create: 2020/11/20 17:28
 */
@RequestMapping("/order")
@FeignClient(value = "order-server")
public interface OrderInfoClient {

    /**
     * 根据订单编号获取订单详情
     *
     * @param orderNo
     * @return
     */
    @GetMapping("v1/getOrderDetails")
    String getOrderDetails(@RequestParam("orderNo") String orderNo);
}
