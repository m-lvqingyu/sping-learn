package com.spring.cglib.proxy.jdk;

import com.spring.cglib.proxy.jdk.handler.MyInvocationHandler;
import com.spring.cglib.proxy.service.UserService;
import com.spring.cglib.proxy.service.impl.UserServiceImpl;

import java.lang.reflect.Proxy;

/**
 * JDK动态代理是基于接口(InvocationHandler) 和反射实现的
 *
 * @author Lv.QingYu
 */
public class App {

    public static void main(String[] args) {
        ClassLoader classLoader = App.class.getClassLoader();
        Class[] classArray = new Class[]{UserService.class};
        MyInvocationHandler handler = new MyInvocationHandler(new UserServiceImpl());
        UserService userService = (UserService) Proxy.newProxyInstance(classLoader, classArray, handler);
        userService.sendMsg();
    }
}
