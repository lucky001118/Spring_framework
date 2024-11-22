package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/spel.xml");
		Demo demo = context.getBean("demoo",Demo.class);
		
		System.out.println(demo);
	}

}
