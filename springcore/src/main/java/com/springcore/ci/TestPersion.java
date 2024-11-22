package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestPersion {

	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ci/ciConfigFile.xml");
		Persion per = (Persion) context.getBean("persion");
		
		System.out.println(per);
		
		//ApplicationContext context2 = new ClassPathXmlApplicationContext("com/springcore/ci/ciConfigFile.xml");
		UserStruct user1 =(UserStruct) context.getBean("users") ;
		
		System.out.println("The UserStruct class's data is: "+user1);
		
		Addition add1 = (Addition) context.getBean("addition");
		System.out.println(add1);
		add1.doSum();
	}
}