package com.uucoding.annotation.importway;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 通过{@link org.springframework.context.annotation.Import}注解向容器中注册bean
 *
 * 实现ImportSelector接口的selectImports方法
 * @author : uu
 * @version : v1.0
 * @Date 2021/7/12  上午9:16
 */
public class MySelector implements ImportSelector {

    /**
     * 返回值为全类名数组
     * @param annotationMetadata 当前标注@Import注解的所有注解信息
     * @return
     */
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{"com.uucoding.annotation.importtest.model.Blue"};
    }
}
