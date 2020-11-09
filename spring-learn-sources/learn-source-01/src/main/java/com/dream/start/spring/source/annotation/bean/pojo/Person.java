package com.dream.start.spring.source.annotation.bean.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Lv.QingYu
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private String name;

    private int age;
}
