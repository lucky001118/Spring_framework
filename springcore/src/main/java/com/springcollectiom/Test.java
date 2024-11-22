package com.springcollectiom;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// you should give it proper location of the configuration file as -->
		// com/springcollectiom/collectionconfig.xml
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcollectiom/collectionconfig.xml");
		Emp employee1 = (Emp) context.getBean("Employee1");

		System.out.println(employee1.getName());
		System.out.println(employee1.getPhones());
		System.out.println(employee1.getAddress());
		System.out.println(employee1.getCourse());
	}

}
