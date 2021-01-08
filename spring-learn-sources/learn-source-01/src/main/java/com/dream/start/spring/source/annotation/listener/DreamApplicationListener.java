package com.dream.start.spring.source.annotation.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Create By 2020/11/22
 *
 * @author lvqingyu
 * @description 创建一个监听
 */
@Slf4j
@Component
public class DreamApplicationListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        log.info("DreamApplicationListener Custom create event:{}", event);
    }
}
