package com.dream.start.spring.source.annotation.component.config;

import com.dream.start.spring.source.annotation.component.filter.CustomComponentScanFilter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * @author Lv.QingYu
 */
@Configuration
@ComponentScan(
        basePackages = {"com.dream.start.spring.source.annotation.component"},
        includeFilters = {@ComponentScan.Filter(type = FilterType.CUSTOM, value = CustomComponentScanFilter.class)},
        useDefaultFilters = false)
public class CustomFilterTypeComponentScanConfig {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CustomFilterTypeComponentScanConfig.class);
        String[] definitionNameArray = context.getBeanDefinitionNames();
        for (String definitionName : definitionNameArray) {
            System.out.println(definitionName);
        }
    }
}
