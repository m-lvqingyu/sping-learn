package com.dream.start.spring.source.annotation.bean.config.lazy;

import com.dream.start.spring.source.annotation.bean.pojo.Car;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Lv.QIngYu
 */
@Slf4j
public class MainApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] definitionNameArray = context.getBeanDefinitionNames();
        for (String definitionName : definitionNameArray) {
            log.info("[@Lazy annotation bean]-definitionName:{}", definitionName);
        }
        Car car001 = (Car) context.getBean("car");
        Car car002 = (Car) context.getBean("car");
        log.info("[@Lazy annotation bean]-car001:{}, car002:{}", car001, car002);
    }
}
