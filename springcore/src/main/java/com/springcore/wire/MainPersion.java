package com.springcore.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainPersion {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/wire/wiring.xml");
		GroupOfPersion groupOfPersion= (GroupOfPersion)context.getBean("grwpr");
		System.out.println(groupOfPersion);
		
//		GroupOfPersion2 gr2 = (GroupOfPersion2) context.getBean("grwpr2");
//		System.out.println(gr2);

	}

}
