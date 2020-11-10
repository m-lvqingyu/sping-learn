package com.dream.start.spring.source.annotation.lifecycle.pojo;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author Lv.QingYu
 */
@Data
@Slf4j
public class Person implements InitializingBean, DisposableBean {

    @Override
    public void destroy() throws Exception {
        log.info("[Person lifecycle destroy]-.............................");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("[Person lifecycle init]-.............................");
    }
}
