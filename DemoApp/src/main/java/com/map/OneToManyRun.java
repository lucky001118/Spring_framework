package com.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToManyRun {
 
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		//creating the Employee's onject
		Employee em1 = new Employee();
		em1.setName("Rahul");
		em1.setSalery(10000);
		
		Employee em2 = new Employee();
		em2.setName("Roshan");
		em2.setSalery(10000);
		
		Employee em3 = new Employee();
		em3.setName("Roshani");
		em3.setSalery(15000);
		
		//creating thr Departments onject
		Department dep = new Department();
		dep.setId(11);
		dep.setName("Development");
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(em1);
		list.add(em2);
		list.add(em3);
		
		dep.setEmployees(list);
		
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		
		session.save(em1);
		session.save(em2);
		session.save(em3);
		session.save(dep);
		
		tr.commit();
        session.close();
 		
		factory.close();
		 
	}
}
