package com.springcore.refrence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefrenceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/refrence/refrenceconfig.xml");
		Persion p1 = (Persion) context.getBean("persion1");
		Address a1 = (Address) context.getBean("address1");

		System.out.println(p1.getFirstName() + " " + p1.getLastName());
		System.out.println(p1.getAge());
		System.out.println(p1.getFullAddress().getWardNo() + ", " + p1.getFullAddress().getCity() + ", "
				+ p1.getFullAddress().getPinCode());
	}

}
