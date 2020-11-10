package com.dream.start.spring.source.annotation.lifecycle.pojo;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.PostConstruct;

/**
 * @author Lv.QingYu
 */
@Data
@Slf4j
public class Monkey {

    @PostConstruct
    public void init() {
        log.info("[Monkey lifecycle init]-.............................");
    }
}
