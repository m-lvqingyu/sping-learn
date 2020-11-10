package com.dream.start.spring.source.annotation.imports.config;

import com.dream.start.spring.source.annotation.imports.pojo.Cat;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author Lv.QingYu
 */
public class CustomImportBeanDefinitionRegister implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        RootBeanDefinition beanDefinition = new RootBeanDefinition(Cat.class);
        registry.registerBeanDefinition("cat", beanDefinition);
    }
}
