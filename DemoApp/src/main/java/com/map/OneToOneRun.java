package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//import org.hibernate.boot.model.source.internal.hbm.AbstractHbmSourceNode;
import org.hibernate.cfg.Configuration;

public class OneToOneRun {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		//creating the object of the question class
		Question q1 = new Question();
		q1.setQuestionId(01);
		q1.setQuestion("Whate is the Java?");
		
		//creating the object of the Answer class
		Answer ans = new Answer();
		ans.setAnswerID(001);
		ans.setAnswr("Java is the programming language created by jemse goseline");
		
		q1.setAnswer(ans);
		ans.setQuestion(q1);
		
		//ans.setQuestion(q1);
		
		Session session = factory.openSession();   //for do changes in db
        Transaction tx = session.beginTransaction();   //to get begain the transaction on the database.
		
        session.save(q1);
        session.save(ans);
        
        tx.commit();
        
        //fatching 
        Question newQ = session.get(Question.class,01);
        System.out.println(newQ.getQuestionId());
        System.out.println(newQ.getQuestion());
        System.out.println(newQ.getAnswer().getAnswr());
        
        session.close();
		factory.close();
		
	}
}
