package com.spring.cglib.proxy.jdk.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * JDK动态代理实现 - InvocationHandler
 *
 * @author Lv.QingYu
 */
public class MyInvocationHandler implements InvocationHandler {

    private Object target;

    public MyInvocationHandler(Object object) {
        this.target = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始执行时间：" + System.currentTimeMillis());
        Object object = method.invoke(target, args);
        System.out.println("执行结束时间：" + System.currentTimeMillis());
        return object;
    }
}
