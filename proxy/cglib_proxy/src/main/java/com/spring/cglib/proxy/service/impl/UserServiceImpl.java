package com.spring.cglib.proxy.service.impl;

import com.spring.cglib.proxy.service.UserService;

/**
 * @author Lv.QingYu
 */
public class UserServiceImpl implements UserService {

    @Override
    public void sendMsg() {
        System.out.println("USER-向外发送消息--------");
    }

}
