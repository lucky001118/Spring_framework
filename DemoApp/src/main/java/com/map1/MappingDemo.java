package com.map1;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MappingDemo {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cgf.xml");
//		SessionFactory fsctory = new cfg.buildSessionFactory();
  	}

}
