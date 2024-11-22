package com.learn;

import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
//import java.sql.Date;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        
        //getting the session factory for creating the session for hibernate. (manedatory class)
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        //creating student 
        Student st =new Student();
        st.setId(101);
        st.setName("Jhon");
        st.setCity("Newyork");
        System.out.println(st);
        
        //creating the object of the Address class
        Address address = new Address();
        address.setStreet("Street1");
        address.setCity("Delhi");
        address.setOpen(true);
        address.setAddedDate(new Date());
        address.setX(123.151444);
        
        //reading the file usong the file stream reader
        FileInputStream fis = new FileInputStream("src/main/java/WhatsApp-Image.jpeg");
        byte [] data = new byte[fis.available()];
        fis.read(data);
        
        address.setImage(data);
        fis.close();

        Session session = factory.openSession();   //for do changes in db
        Transaction tx = session.beginTransaction();   //to get begain the transaction on the database.
        
        session.save(st);         //saving the session
        session.save(address);   //saving the session address class 
        
        tx.commit();           //committing the transaction
        session.close();    //closing the session for DB transaction
        
        
        System.out.println("done..");
    }
}
