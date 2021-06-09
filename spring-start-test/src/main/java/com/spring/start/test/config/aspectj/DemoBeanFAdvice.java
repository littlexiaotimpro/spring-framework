package com.spring.start.test.config.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 对于代理的目标类，Spring会自动根据类型或设置判断代理模式，
 * 	- Cglib
 * 	- JDK
 */
@Aspect
@Component
public class DemoBeanFAdvice {

	@Pointcut(value = "execution(* com.spring.start.test.entity.DemoBeanF.get*(..))")
	public void pointCut() {
	}

	/**
	 * 前置通知
	 */
	@Before(value = "pointCut()")
	public void before() {
		System.out.println("Before............前置通知");
	}

}
