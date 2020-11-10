package com.dream.start.spring.source.annotation.imports.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Lv.QingYu
 */
@Slf4j
public class MainApplication {

    /**
     * 向IOC容器中添加组件的方式是：
     * - 1) @ComponentScan + @Controller、@Service、@Repository
     * - 2) @Configuration + @Bean
     * - 3) @Import + ImportSelector 组件的ID为全类名路径
     * - 4) @Import + ImportBeanDefinitionRegister 组件的ID可以自定义
     *
     * @param args
     */
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] definitionNameArray = context.getBeanDefinitionNames();
        for (String definitionName : definitionNameArray) {
            log.info("[@Import init bean]-definitionName:{}", definitionName);
        }
        System.out.println(context.getBean("com.dream.start.spring.source.annotation.imports.pojo.Person"));
    }
}
