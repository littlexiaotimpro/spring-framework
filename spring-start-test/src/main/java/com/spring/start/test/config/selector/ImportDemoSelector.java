package com.spring.start.test.config.selector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Set;

/**
 * 自定义的导入选择器，用于注入第三方jar包配置
 */
public class ImportDemoSelector implements ImportSelector {

    /**
     * 选择需要导入的类进容器
     * @param importingClassMetadata 当前类的注解信息
     * @return 需要导入的类的全限定类名数组，不能返回null
     */
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        Set<String> annotationTypes = importingClassMetadata.getAnnotationTypes();
        return new String[]{"com.spring.start.test.entity.DemoBeanD"};
    }
}
