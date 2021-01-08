package com.dream.start.spring.source.two.processor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Create By 2020/11/22
 *
 * @author lvqingyu
 */
public class MainApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);

    }

}
