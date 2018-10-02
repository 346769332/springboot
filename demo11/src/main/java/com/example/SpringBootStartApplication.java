package com.example;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

public class SpringBootStartApplication extends SpringBootServletInitializer {
 
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(Demo11Application.class);
	}
    
	
}
