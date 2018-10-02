package com.example;

import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,MybatisAutoConfiguration.class})
@ImportResource(locations= {"app.xml"})
public class Demo11Application {

	public static void main(String[] args) {
		try {
			SpringApplication.run(Demo11Application.class, args);
		} catch (Exception e) {
		    e.printStackTrace();
		}
		
	}
}
