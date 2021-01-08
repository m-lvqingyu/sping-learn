package com.spring.cglib.proxy.cglib;

import com.spring.cglib.proxy.cglib.interceptor.MyInterceptor;
import com.spring.cglib.proxy.service.UserService;
import com.spring.cglib.proxy.service.impl.UserServiceImpl;
import net.sf.cglib.proxy.Enhancer;

/**
 * cglib 动态代理是通过继承操作类的字节码，底层是用asm框架（java字节码生成架构）技术实现的
 *
 * @author Lv.QingYu
 */
public class App {

    /**
     * 静态代理优缺点
     * <p>
     * 优点：
     * 静态代理对（代理类）隐藏了被代理类（目标类接口）的具体实现类，在一定程度上实现了解耦合，同时也隐藏了具体的代码实现，提高了安全性！
     * <p>
     * 缺点：
     * 代理对象的一个接口只服务于一种类型的对象，如果要代理的方法很多，需要为每一种方法都进行代理，就会产生很多的代理类，就会产生类爆炸类过多，静态代理在程序规模稍大时就无法胜任。如果接口增加一个方法，除了所有实现类需要实现这个方法外，所有代理类也需要实现此方法，增加了代码维护的复杂度。
     * <p>
     * 动态代理优缺点：
     * <p>
     * 优点：
     * 动态代理与静态代理相比较，最大的好处是接口中声明的所有方法都被转移到调用处理器一个集中的方法中处理（InvocationHandler.invoke）。这样，在接口方法数量比较多的时候，可以进行灵活处理，而不需要像静态代理那样每一个方法进行中转。而且动态代理的应用使类职责更加单一，复用性更强。
     * <p>
     * 缺点：
     * 1、JDK原生动态代理是Java原生支持的，不需要任何外部依赖，但是它只能基于接口进行代理（因为代理类已经继承了Proxy了，Java不支持多继承。比如:$Proxy0 extends Proxy implements UserService），如果被代理类没有实现接口，则无法被代理。
     * 2、CGLIB通过继承的方式进行代理、无论目标对象没有没实现接口都可以代理，但是无法处理private和final的情况（private和final修饰的方法不能被重写）
     *
     * @param args
     */
    public static void main(String[] args) {
        // 创建生成代理对象的类
        Enhancer enhancer = new Enhancer();
        // 设置目标类为代理对象的父类
        enhancer.setSuperclass(UserServiceImpl.class);
        // 设置回调拦截器
        enhancer.setCallback(new MyInterceptor());
        // 创建代理对象
        UserService userService = (UserService) enhancer.create();
        userService.sendMsg();
    }

}
