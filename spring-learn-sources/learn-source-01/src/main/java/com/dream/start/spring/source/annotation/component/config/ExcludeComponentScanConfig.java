package com.dream.start.spring.source.annotation.component.config;

import com.dream.start.spring.source.annotation.component.service.MainService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @author Lv.QingYu
 * @description 扫描 com.dream.start.spring.source.annotation.component 包下的@Controller、@Service、@Repository、@Component等注解，
 * 但是需要排除@Controller注解的Bena和MainService类型的Bean。
 */
@Configuration
@ComponentScan(
        basePackages = {"com.dream.start.spring.source.annotation.component"},
        excludeFilters = {
                @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Controller.class),
                @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = MainService.class)
        })
public class ExcludeComponentScanConfig {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ExcludeComponentScanConfig.class);
        String[] definitionNameArray = context.getBeanDefinitionNames();
        for (String definitionName : definitionNameArray) {
            System.out.println(definitionName);
        }
    }
}
