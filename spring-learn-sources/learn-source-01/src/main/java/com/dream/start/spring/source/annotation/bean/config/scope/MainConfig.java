package com.dream.start.spring.source.annotation.bean.config.scope;

import com.dream.start.spring.source.annotation.bean.pojo.Car;
import com.dream.start.spring.source.annotation.bean.pojo.Person;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

/**
 * @author Lv.QingYu
 */
@Configuration
public class MainConfig {

    /**
     * 如果@Bean注解的name没有配置，则这个对象的名称默认就是法名。@Bean在不指定@Scope的情况下，
     * 所有的Bean都是单实例的，而且都是饥饿加载模式。（容器启动时就创建实例）
     *
     * @return
     */
    @Bean(name = "rothMan")
    public Person person() {
        return new Person("roth", 10);
    }

    /**
     * 当@Bean在指定@Scope为prototype时，Bean为多实例的，而且是懒汉加载模式。（容器启动时，并不会立即创建，
     * 只有在第一次使用时，才会创建该实例）。@Scope的value属性：
     * a) singleton 单实例的(默认)
     * b) prototype 多实例的
     * c) request 同一次请求
     * d) session 同一个会话级别
     *
     * @return
     */
    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
    public Car car() {
        return new Car();
    }
}
