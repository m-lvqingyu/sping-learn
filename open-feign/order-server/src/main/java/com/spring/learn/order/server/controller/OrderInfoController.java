package com.spring.learn.order.server.controller;

import com.spring.learn.order.api.OrderInfoClient;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lv.QingYu
 */
@RestController
public class OrderInfoController implements OrderInfoClient {

    @Override
    public String getOrderDetails(String orderNo) {
        return orderNo;
    }

}
