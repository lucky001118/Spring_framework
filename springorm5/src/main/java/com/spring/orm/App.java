package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;
//import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
       
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        HibernateTemplate template = context.getBean("template",HibernateTemplate.class);
        System.out.println(template);
    }
}