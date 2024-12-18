package com.springcore.strereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String []args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/strereotype/stereoconfig.xml");
		Student student = context.getBean("obj",Student.class);
		System.out.println(student);
		System.out.println(student.getClass().getName());
		System.out.println(student.hashCode());
		Student student2 = context.getBean("obj",Student.class);
		System.out.println(student2.hashCode());
		System.out.println("----------------------------------------");
		System.out.println("Teacher class's objects hashCode");
		Teacher teacher = context.getBean("teacher",Teacher.class);
		Teacher teacher2 = context.getBean("teacher",Teacher.class);
		System.out.println(teacher.hashCode());
		System.out.println(teacher2.hashCode());
		
	}
	
}
