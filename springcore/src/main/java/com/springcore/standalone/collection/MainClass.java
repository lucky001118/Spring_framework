package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
	ApplicationContext context = 
			new ClassPathXmlApplicationContext("com/springcore/standalone/collection/alonconfig.xml");
	
	Persion perssion = context.getBean("persion",Persion.class); 
	  System.out.println(perssion);
	 
	}

}
