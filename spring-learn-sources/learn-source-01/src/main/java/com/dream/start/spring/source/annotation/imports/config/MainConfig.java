package com.dream.start.spring.source.annotation.imports.config;

import com.dream.start.spring.source.annotation.imports.pojo.Car;
import com.dream.start.spring.source.annotation.imports.pojo.Person;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Lv.QingYu
 */
@Configuration
@Import(value = {Person.class, Car.class, CustomImportSelector.class, CustomImportBeanDefinitionRegister.class})
public class MainConfig {
}
