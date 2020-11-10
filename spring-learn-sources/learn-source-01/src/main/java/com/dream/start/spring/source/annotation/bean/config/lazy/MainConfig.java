package com.dream.start.spring.source.annotation.bean.config.lazy;

import com.dream.start.spring.source.annotation.bean.pojo.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * @author Lv.QingYu
 */
@Configuration
public class MainConfig {

    /**
     * 注解@Lazy的作用是：针对单例模式，容器在启动时不会立即创建Bean,而是在第一次使用时，才会创建该对象。
     * （虽然是懒加载了，单仍然是单例模式）
     *
     * @return
     */
    @Bean
    @Lazy
    public Car car() {
        return new Car();
    }
}
