package com.uucoding.annotation.config;

import com.uucoding.annotation.importway.MyImportBeanDefinitionRegistrar;
import com.uucoding.annotation.importway.MySelector;
import com.uucoding.annotation.importway.model.Black;
import org.springframework.context.annotation.Import;

/**
 * @author : uu
 * @version : v1.0
 * @Date 2021/7/12  上午9:16
 */
@Import({Black.class, MySelector.class, MyImportBeanDefinitionRegistrar.class})
public class MyImportConfig {

}
