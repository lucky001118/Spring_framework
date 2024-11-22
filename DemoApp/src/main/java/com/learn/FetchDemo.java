package com.learn;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
public static void main(String[] args) {
	//get, load
	
	 //getting the session factory for creating the session for hibernate. (manedatory class)
    Configuration cfg = new Configuration();
    cfg.configure("hibernate.cfg.xml");
    SessionFactory factory = cfg.buildSessionFactory();
    Session session = factory.openSession();
   
    //the Transaction is only use for the save data on database only, for fatching Transaction is not use
    //the get method is used for the getting values from the database.
    Student student =(Student)session.load(Student.class, 103); 
    System.out.println(student);
    
    //fatching the Address entity's value
    Address address = (Address)session.get(Address.class,1);
    System.out.println(address.getStreet()+" , "+address.getCity()+" , ");
    
    session.close();
    factory.close();
}
}
