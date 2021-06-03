package com.spring.start.test.entity;

import org.springframework.beans.factory.annotation.Autowired;

public class DemoBean {

    @Autowired
    private DemoBeanC demoBeanC;
    @Autowired
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
