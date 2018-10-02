package com.example;

import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class,MybatisAutoConfiguration.class})
@SpringBootApplication
@ComponentScan(basePackages = {"com.example.control"})
public class DemoApplication {
	public static void main(String[] args) {
        try {
            SpringApplication.run(DemoApplication.class, args);
        }catch (Exception e){
            e.printStackTrace();
        }
	}
}
