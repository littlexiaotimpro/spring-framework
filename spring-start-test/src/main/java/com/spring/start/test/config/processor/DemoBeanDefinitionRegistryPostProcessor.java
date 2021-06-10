package com.spring.start.test.config.processor;

import com.spring.start.test.entity.DemoBeanB;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * 自定义Bean定义注册类的后置处理器
 */
@Component
public class DemoBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		// 定义注入的实例的Bean定义
		RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(DemoBeanB.class);
		// 设置其作用域：单例
		rootBeanDefinition.setScope(BeanDefinition.SCOPE_SINGLETON);
		// @Import 注入的实例默认是类的全限定类名，自定义注入的可以指定注入的实例名
		registry.registerBeanDefinition("demoBeanB", rootBeanDefinition);
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		BeanDefinition beanDefinition = beanFactory.getBeanDefinition("demoBean1");
		beanDefinition.setScope(BeanDefinition.SCOPE_PROTOTYPE);
	}
}
