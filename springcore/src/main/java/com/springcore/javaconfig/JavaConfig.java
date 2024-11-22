package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.javaconfig")
public class JavaConfig {
	
	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}

	@Bean(name = {"student","temp","con"})
	public Student getStudent() {
		//we can access this student class with the help of bean name --> student or temp or con
		//and if we not giving it bean name then we can access this class by this mathod name--> getStudent
		Student student = new Student(getSamosa());
		return student;
	}
}
