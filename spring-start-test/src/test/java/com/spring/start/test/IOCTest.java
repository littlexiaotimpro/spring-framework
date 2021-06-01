package com.spring.start.test;

import com.spring.start.test.config.ComponentScanConfig;
import com.spring.start.test.entity.DemoBeanD;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest {

	@Test
	public void test() {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ComponentScanConfig.class);
		DemoBeanD demoBeanD = applicationContext.getBean(DemoBeanD.class);
		System.out.println(demoBeanD.toString());
		applicationContext.close();
	}

}
