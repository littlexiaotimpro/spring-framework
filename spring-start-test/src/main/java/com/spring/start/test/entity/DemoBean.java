package com.spring.start.test.entity;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import javax.inject.Inject;

/**
 * 测试不同注解的注入方式
 */
public class DemoBean {

	/**
	 * 循环依赖
	 * Spring 通过三级缓存解决循环依赖：
	 * 	一级：singletonObjects
	 * 		-> 存放已经创建完成的可用单实例
	 * 	二级：earlySingletonObjects
	 * 		-> 存放需要提前暴露的对象，这些对象已经完成了创建，但未进行属性赋值和初始化，用于解决循环依赖
	 * 	三级：singletonFactories
	 * 		-> 存放实例bean的工厂对象，用来生成半成品的bean并放入二级缓存中，用于解决循环依赖
	 */
	@Autowired
	private DemoBeanE demoBeanE;

	/**
	 * JSR-250
	 */
    @Resource
    private DemoBeanC demoBeanC;

	/**
	 * JSR-330
	 */
	@Inject
    private DemoBeanD demoBeanD;

    /**
     * 初始化方法
     */
    public void init(){
        System.out.println("Bean.initMethod =====>" + getClass().getSimpleName());
    }

    /**
     * 销毁
     */
    public void destroy(){
        System.out.println("Bean.destroyMethod =====>" + getClass().getSimpleName());
    }

}
