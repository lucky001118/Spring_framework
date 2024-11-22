package com.learn;

//import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EMDemo {

	public static void main(String[] args) {
		 //getting the session factory for creating the session for hibernate. (manedatory class)
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Student st=new Student();
        st.setId(1245);
        st.setName("Bhanu");
        st.setCity("Bengluru");
        
        Certificate certificate = new Certificate();
        certificate.setCourse("Java");
        certificate.setDuratin("2 months");
        
        st.setCerti(certificate);
        
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction(); 
        
        //save objects--
        session.save(st);
        
        tx.commit();
        session.close();
        factory.close();
       
	}
}
