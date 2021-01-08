package com.spring.cglib.proxy.cglib.interceptor;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author Lv.QingYu
 */
public class MyInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("开始执行时间：" + System.currentTimeMillis());
        Object object = methodProxy.invokeSuper(o, objects);
        System.out.println("执行结束时间：" + System.currentTimeMillis());
        return object;
    }
}
