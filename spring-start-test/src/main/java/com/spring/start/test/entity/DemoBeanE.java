package com.spring.start.test.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DemoBeanE {

	@Autowired
    private DemoBean demoBean;
}
