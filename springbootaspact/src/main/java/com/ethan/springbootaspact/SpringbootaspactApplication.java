package com.ethan.springbootaspact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SpringbootaspactApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootaspactApplication.class, args);
	}

}
