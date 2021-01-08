package com.dream.start.spring.source.two.processor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * Create By 2020/11/22
 *
 * @author lvqingyu
 * @description BeanFactoryPostProcessor Bean在实例化之前，可以通过ConfigurableListableBeanFactory设置Bean的一些属性
 */
@Slf4j
@Component
public class DreamBeanFactoryProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        String[] beanDefinitionNameArray = beanFactory.getBeanDefinitionNames();
        for (String name : beanDefinitionNameArray) {
            log.info("DreamBeanFactoryProcessor name:{}", name);
            if (name.equals("dreamInfo")) {
                BeanDefinition beanDefinition = beanFactory.getBeanDefinition(name);
                // 懒加载
                beanDefinition.setLazyInit(true);
            }
        }
    }
}
