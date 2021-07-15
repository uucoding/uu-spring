package com.uucoding.annotation.factorybean;

import com.uucoding.annotation.factorybean.model.Color;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author : uu
 * @version : v1.0
 * @Date 2021/7/15  07:53
 */
public class ColorFactoryBean implements FactoryBean<Color> {

    /**
     * 返回一个color对象，这个对象回添加到容器中
     * @return
     * @throws Exception
     */
    @Override
    public Color getObject() throws Exception {
        System.out.println("调用创建Color bean");
        return new Color();
    }

    /**
     * 获取对象类型
     * @return
     */
    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }

    /**
     * 是否是单例（默认是）
     *
     * true:单例
     * false：多例 每次获取都会调用{@link ColorFactoryBean#getObject()}
     * @return
     */
    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
