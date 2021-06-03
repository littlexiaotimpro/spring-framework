package com.spring.start.test;

import com.spring.start.test.config.ComponentScanConfig;
import com.spring.start.test.entity.DemoBeanD;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.util.logging.LogManager;

public class Application {

	static {
		try {
			LogManager.getLogManager().readConfiguration(new ClassPathResource("logging.properties").getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static final Log LOGGER = LogFactory.getLog(Application.class);

	public static void main(String[] args) {
		LOGGER.debug("Application Starting...");
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ComponentScanConfig.class);
		DemoBeanD demoBeanD = applicationContext.getBean(DemoBeanD.class);
		System.out.println(demoBeanD.toString());
		applicationContext.close();
		LOGGER.debug("Application Stopped!");
	}

}
