package com.dream.start.spring.source.annotation.component.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;
import java.util.Set;

/**
 * @author Lv.QingYu
 * @description @ComponentScan包扫描，自定义包扫描过滤规则
 */
@Slf4j
public class CustomComponentScanFilter implements TypeFilter {

    /**
     * @param metadataReader        读取到的当前正在扫描的类的信息
     * @param metadataReaderFactory 可以获取到其他任何类信息的
     * @return
     * @throws IOException
     */
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        // 获取当前类注解的信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        Set<String> annotationTypeSet = annotationMetadata.getAnnotationTypes();
        for (String annotationType : annotationTypeSet) {
            log.info("[componentScan custom filter]-AnnotationMetadata-annotationType:{}", annotationType);
        }
        boolean hasAnnotation = annotationMetadata.hasAnnotation("org.springframework.stereotype.Controller");
        if (hasAnnotation) {
            return true;
        }
        // 获取当前正在扫描的类的信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        // 获取当前正在扫描的类的资源信息
        Resource resource = metadataReader.getResource();
        log.info("[componentScan custom filter]-AnnotationMetadata-resource:{}", resource);
        String className = classMetadata.getClassName();
        if (className.contains("service")) {
            return true;
        }
        return false;
    }

}
