package com.klef.jfsd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.klef.jfsd")
public class Library1Application {

	public static void main(String[] args) {
		SpringApplication.run(Library1Application.class, args);
		System.out.println("Program runs Successfully");
	}

}
