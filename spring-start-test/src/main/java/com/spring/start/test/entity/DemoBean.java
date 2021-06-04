package com.spring.start.test.entity;

import javax.annotation.Resource;
import javax.inject.Inject;

/**
 * 测试不同注解的注入方式
 */
public class DemoBean {

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
