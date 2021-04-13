package com.atguigu.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * TODO: 文件注释
 *
 * @author 陈友增
 * @date 2021/4/13
 */
public class WindowCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        // 获取ioc使用的beanFactory
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        // 类加载器
        ClassLoader classLoader = context.getClassLoader();
        // 获取环境
        Environment environment = context.getEnvironment();
        // 获取bean定义的注册类型
        BeanDefinitionRegistry registry = context.getRegistry();
        return environment.getProperty("os.name").contains("Window");
    }
}
