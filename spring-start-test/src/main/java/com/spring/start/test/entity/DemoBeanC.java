package com.spring.start.test.entity;

import org.springframework.beans.factory.annotation.Value;

/**
 * 在配置类中通过{@link org.springframework.context.annotation.Import} 注入
 * ImportDemoBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar
 * 手动为当前实例生成一个 RootBeanDefinition
 * 并通过 BeanDefinitionRegistry 将定义注册进容器
 */
public class DemoBeanC {

	@Value("${default.c-value}")
	private String demoInt;

}
