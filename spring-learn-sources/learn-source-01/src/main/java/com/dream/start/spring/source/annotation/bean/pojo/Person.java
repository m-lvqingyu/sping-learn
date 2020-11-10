package com.dream.start.spring.source.annotation.bean.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Lv.QingYu
 */
@Getter
@Setter
@Slf4j
public class Person {

    private String name;

    private int age;

    public Person() {
        log.info("[Person construction method init]-.............................");
    }

    public Person(String name, int age) {
        log.info("[Person construction method init]-.............................");
        this.name = name;
        this.age = age;
    }
}
