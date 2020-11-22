package com.dream.start.spring.source.two.processor;

import lombok.Data;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Create By 2020/11/22
 *
 * @author lvqingyu
 */
@ToString
@Slf4j
@Component
public class DreamInfo {

    @Value("spring source")
    private String name;

    public DreamInfo() {
        log.info("DreamInfo 构造方法执行。。。。");
    }

}
