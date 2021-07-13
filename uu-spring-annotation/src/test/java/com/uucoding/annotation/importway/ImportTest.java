package com.uucoding.annotation.importway;

import com.uucoding.annotation.config.MyImportConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : uu
 * @version : v1.0
 * @Date 2021/7/13  08:58
 */
public class ImportTest {

    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyImportConfig.class);

    @Test
    public void importTest () {
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}
