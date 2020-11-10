package com.dream.start.spring.source.annotation.conditional.config;

import com.dream.start.spring.source.annotation.conditional.pojo.Car;
import com.dream.start.spring.source.annotation.conditional.pojo.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author Lv.QingYu
 */
@Configuration
public class MainConfig {

    @Bean
    public Person person() {
        return new Person();
    }

    /**
     * 条件注解，定义了两个组件person和car，但是容器中必须有person这个组件时，car才会被创建。
     * <p>
     * 基于@Conditional注解，Spring对其进行了扩展：
     * - @ConditionalOnBean 在存在某个bean的时候
     * - @ConditionalOnMissingBean 不存在某个bean的时候
     * - @ConditionalOnClass 当前classpath可以找到某个类型的类时
     * - @ConditionalOnMissingClass 当前classpath不可以找到某个类型的类时
     * - @ConditionalOnResource 当前classpath是否存在某个资源文件
     * - @ConditionalOnProperty 当前jvm是否包含某个系统属性为某个值
     * - @ConditionalOnWebApplication 当前spring context是否是web应用程序
     *
     * @return
     */
    @Bean
    @Conditional(value = {CustomConditional.class})
    public Car car() {
        return new Car();
    }
}
