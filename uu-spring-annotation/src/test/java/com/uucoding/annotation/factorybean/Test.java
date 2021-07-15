package com.uucoding.annotation.factorybean;

import com.uucoding.annotation.config.MyImportConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : uu
 * @version : v1.0
 * @Date 2021/7/13  08:58
 */
public class Test {

    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(FactoryBeanConfig.class);

    @org.junit.Test
    public void test () {
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
        Object colorFactoryBean = applicationContext.getBean("colorFactoryBean");
        System.out.println("colorFactoryBean的创建的Bean的类型：" + colorFactoryBean.getClass());
        // bean名称前面加上&获取的是FactoryBean的本身Class（BeanFactory工厂中有定义FACTORY_BEAN_PREFIX常量标记前缀）
        Object colorFactoryBean2 = applicationContext.getBean("&colorFactoryBean");
        System.out.println("colorFactoryBean的本身类型：" + colorFactoryBean2.getClass());
    }
}
