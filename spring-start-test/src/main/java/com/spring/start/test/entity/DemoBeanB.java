package com.spring.start.test.entity;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * 先执行实例的注册后置处理，再执行 BeanFactory 的后置处理
 * DemoBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor
 * 默认注入的是对象的单实例 Bean，在实例开始创建之前，可以对对象定义进行属性修改
 * DemonBeanFactoryPostProcessor implements BeanFactoryPostProcessor
 * 在实际对象创建前，BeanFactoryPostProcessor 可以对 BeanFactory 进行处理
 * 在处理过程中可以对通过获取处理对象的 BeanDefinition 对象，修改其中的属性
 * 如：
 * beanDefinition.setScope("prototype");
 * 将对象作用域由单实例改为多实例，那么在容器刷新的过程中，并不会创建此类型的对象
 */
public class DemoBeanB implements InitializingBean, DisposableBean {

	@Override
	public void afterPropertiesSet() throws Exception {
		// 先于指定的 init-method 方法前执行
		System.out.println("初始化方法 === InitializingBean.afterPropertiesSet =====>" + getClass().getSimpleName());
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("销毁方法 === DisposableBean.destroy =====>" + getClass().getSimpleName());
	}
}
