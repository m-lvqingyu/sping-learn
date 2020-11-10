package com.dream.start.spring.source.annotation.lifecycle.config;

import com.dream.start.spring.source.annotation.lifecycle.pojo.Car;
import com.dream.start.spring.source.annotation.lifecycle.pojo.Monkey;
import com.dream.start.spring.source.annotation.lifecycle.pojo.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Lv.QingYu
 */
@Configuration
public class MainConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Car car(){
        return new Car();
    }

    @Bean
    public Person person(){
        return new Person();
    }

    @Bean
    public Monkey monkey(){
        return new Monkey();
    }
}
