package com.dream.start.spring.source.annotation.bean.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * @author Lv.QingYu
 */
@Getter
@Setter
@Slf4j
@AllArgsConstructor
public class Car {

    private String name;

    private BigDecimal price;

    public Car() {
        log.info("[Car construction method init]-.............................");
    }
}
