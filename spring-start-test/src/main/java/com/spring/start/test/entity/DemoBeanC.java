package com.spring.start.test.entity;

import org.springframework.beans.factory.annotation.Value;

public class DemoBeanC {

    @Value("${default.c-value}")
    private String demoInt;

}
