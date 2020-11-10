package com.dream.start.spring.source.annotation.conditional.config;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author Lv.QingYu
 */
public class CustomConditional implements Condition {

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        ConfigurableListableBeanFactory beanFactory = conditionContext.getBeanFactory();
        // 容器中是否存在 conditionalService 组件
        boolean result = beanFactory.containsBean("person");
        if (result) {
            return true;
        }
        return false;
    }
}
