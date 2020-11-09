package com.dream.start.spring.source.annotation.bean;

import com.dream.start.spring.source.annotation.bean.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Lv.QingYu
 */
@ComponentScan
public class MainApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext xmlContext = new ClassPathXmlApplicationContext("person.xml");
        System.out.println("Xml的方式获取Bean:" + xmlContext.getBean("jackMan"));
        AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        System.out.println("Configuration注解的方式获取Bean:" + annotationContext.getBean("rothMan"));
    }
}
