package com.hexagon.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan ({"com.hexagon.*"})
@EnableWebMvc
public class CrsSessionSpringRestHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrsSessionSpringRestHibernateApplication.class, args);
	}

}
