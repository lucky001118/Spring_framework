package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainForLifecycle {
	public static void main(String []args) {
		AbstractApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycle.xml");
//		Samosa samosa = (Samosa)context.getBean("s1");
//		System.out.println(samosa);
		
		context.registerShutdownHook();  //for shut down hookes
		//pepsi class
		
		Pepsi pepsi = (Pepsi)context.getBean("pepsi");
		System.out.println(pepsi);
	}

}
