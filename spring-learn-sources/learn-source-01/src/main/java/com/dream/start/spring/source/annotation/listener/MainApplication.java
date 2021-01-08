package com.dream.start.spring.source.annotation.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Create By 2020/11/22
 *
 * @author lvqingyu
 */
public class MainApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        context.publishEvent(new ApplicationEvent("手动发布一个事件") {
            @Override
            public Object getSource() {
                return super.getSource();
            }
        });
        context.close();
    }
}
