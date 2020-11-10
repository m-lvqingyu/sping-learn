package com.dream.start.spring.source.annotation.imports.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author Lv.QingYu
 */
public class CustomImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{"com.dream.start.spring.source.annotation.imports.pojo.Dog"};
    }
}
