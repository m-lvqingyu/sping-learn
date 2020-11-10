package com.dream.start.spring.source.annotation.imports.factory;

import com.dream.start.spring.source.annotation.imports.pojo.Monkey;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author Lv.QingYu
 */
public class MonkeyFactoryBean implements FactoryBean<Monkey> {

    @Override
    public Monkey getObject() throws Exception {
        return new Monkey();
    }

    @Override
    public Class<?> getObjectType() {
        return Monkey.class;
    }
}
