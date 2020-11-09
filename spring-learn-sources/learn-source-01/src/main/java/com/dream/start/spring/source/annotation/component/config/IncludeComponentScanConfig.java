package com.dream.start.spring.source.annotation.component.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @author Lv.QingYu
 * @description 扫描com.dream.start.spring.source.annotation.component 包下的@Controller、@Service、@Repository、@Component等注解，
 * 但是只包含@Controller注解的Bean。不过需要注意的是，使用includeFilters方式时，useDefaultFilters需要设置为false（默认为true）,
 * 否则includeFilters方式不生效，还是会扫描所有。
 */
@Configuration
@ComponentScan(
        basePackages = {"com.dream.start.spring.source.annotation.component"},
        includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = Controller.class)},
        useDefaultFilters = false
)
public class IncludeComponentScanConfig {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(IncludeComponentScanConfig.class);
        String[] definitionNameArray = context.getBeanDefinitionNames();
        for (String definitionName : definitionNameArray) {
            System.out.println(definitionName);
        }
    }
}
