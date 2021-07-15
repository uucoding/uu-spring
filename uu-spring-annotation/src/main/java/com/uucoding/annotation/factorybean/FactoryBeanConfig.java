package com.uucoding.annotation.factorybean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * FactoryBean配置
 * @author : uu
 * @version : v1.0
 * @Date 2021/7/15  07:57
 */
@Configuration
public class FactoryBeanConfig {

    @Bean
    public ColorFactoryBean colorFactoryBean() {
        return new ColorFactoryBean();
    }
}
