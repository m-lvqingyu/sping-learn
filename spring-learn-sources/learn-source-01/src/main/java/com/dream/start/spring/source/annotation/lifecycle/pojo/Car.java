package com.dream.start.spring.source.annotation.lifecycle.pojo;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Lv.QingYu
 */
@Data
@Slf4j
public class Car {

    public Car() {
        log.info("[Car construction method init]-.............................");
    }

    public void init() {
        log.info("[Car lifecycle init]-.............................");
    }

    public void destroy() {
        log.info("[Car lifecycle destroy]-.............................");
    }
}
