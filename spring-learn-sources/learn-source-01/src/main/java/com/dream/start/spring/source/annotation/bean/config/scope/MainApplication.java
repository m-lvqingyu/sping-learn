package com.dream.start.spring.source.annotation.bean.config.scope;

import com.dream.start.spring.source.annotation.bean.pojo.Car;
import com.dream.start.spring.source.annotation.bean.pojo.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Lv.QingYu
 */
@Slf4j
public class MainApplication {

    public static void main(String[] args) {
        // Create Bean for xml or annotation
        ClassPathXmlApplicationContext xmlContext = new ClassPathXmlApplicationContext("person.xml");
        Person jackMan = (Person) xmlContext.getBean("jackMan");
        log.info("[Create bean for xml]-jackMan:{}", jackMan);
        AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] definitionNameArray = annotationContext.getBeanDefinitionNames();
        for (String definitionName : definitionNameArray) {
            log.info("Spring init bean name:{}", definitionName);
        }
        Person rothMan = (Person) annotationContext.getBean("rothMan");
        log.info("[Create bean for annotation]-rothMan:{}", rothMan);

        // @Scope test
        Person person001 = (Person) annotationContext.getBean("rothMan");
        Person person002 = (Person) annotationContext.getBean("rothMan");
        log.info("[@Scope singleton(单例)]-person001:{}, person002:{}", person001, person002);
        Car jack001 = (Car) annotationContext.getBean("car");
        Car jack002 = (Car) annotationContext.getBean("car");
        log.info("[@Scope prototype(多例)]-jack001:{}, jack002:{}", jack001, jack002);
    }
}
