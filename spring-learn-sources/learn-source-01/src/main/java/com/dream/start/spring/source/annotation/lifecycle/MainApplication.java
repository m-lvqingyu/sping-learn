package com.dream.start.spring.source.annotation.lifecycle;

import com.dream.start.spring.source.annotation.lifecycle.config.MainConfig;
import com.dream.start.spring.source.annotation.lifecycle.pojo.Car;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Lv.QingYu
 * @description Bean的生命周期初始化和销毁的三种方式：
 * 1) @Bean - initMethod 和 destroyMethod
 * 2) 实现InitializingBean 和 DisposableBean接口
 * 3) 通过JSR250规范 提供的注解@PostConstruct 和@ProDestory标注的方法
 */
@Slf4j
public class MainApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] definitionNameArray = context.getBeanDefinitionNames();
        for (String definitionName : definitionNameArray) {
            log.info("[Bean lifecycle]-definitionName:{}", definitionName);
        }
        Car car = (Car) context.getBean("car");
        log.info("[Bean lifecycle]-car:{}", car);
    }
}
