package com.uucoding.annotation.importway;

import com.uucoding.annotation.importway.model.Red;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 手动注册bean
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/7/12  上午9:16
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    /**
     * 注册bean
     * @param importingClassMetadata
     * @param registry
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean hasBlue = registry.containsBeanDefinition("com.uucoding.annotation.importtest.model.Blue");
        // 包含blue的时候才注册
        if (hasBlue) {
            // 指定bean类型
            RootBeanDefinition redBeanDefinition = new RootBeanDefinition(Red.class);
            // 注册bean
            registry.registerBeanDefinition("red", redBeanDefinition);
        }
    }
}
