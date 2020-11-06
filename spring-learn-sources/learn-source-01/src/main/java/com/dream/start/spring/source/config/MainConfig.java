package com.dream.start.spring.source.config;

import com.dream.start.spring.source.pojo.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Lv.QingYu
 */
@Configuration
public class MainConfig {

    /**
     * 如果@Bean注解的name没有配置，则这个对象的名称默认就是法名
     *
     * @return
     */
    @Bean(name = "rothMan")
    public Person person() {
        return new Person("roth", 10);
    }
}
