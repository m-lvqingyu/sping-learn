package com.spring.learn.users.server.controller;

import com.spring.learn.order.api.OrderInfoClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lv.QingYu
 */
@Slf4j
@RestController
@RequestMapping(value = "/user")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UsersServerController {

    private final OrderInfoClient orderInfoClient;

    @GetMapping("orderDetails")
    public String getOrderDetails(@RequestParam("orderNo") String orderNo) {
        log.info("openfeign learn orderNo:{}", orderNo);
        String orderDetails = orderInfoClient.getOrderDetails(orderNo);
        return orderDetails;
    }
}
