package com.spring.jdbc;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entites.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
    	
        System.out.println( "My program is started..." );
        
        //spring jdbc ==> JdbcTemplate
        //xml base configuration
       // ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/configjdbc.xml");
        
        //Annotation base configuration
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        
        /*JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);
      //insert query
      String query = "insert into student(id,name,city) values(?,?,?)";
      //fire query
      int result = template.update(query,246,"Manish Thakur","Kanpuriha");
      System.out.println("number of record inserted: "+result); */
   //----------------------------------------------------------------------------------------//      
        /*StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
        Student student = new Student();
        student.setId(100);
        student.setName("Chandu");
        student.setCity("Jaipur");
        int result = studentDao.insert(student);
        System.out.println("student is inserted: "+result);*/
   //---------------------------------------------------------------------------------------//
        //update query
       /*StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
        Student student = new Student();
        student.setId(100);
        student.setName("Chandu Champion");
        student.setCity("Goregaon");
        int result = studentDao.change(student);
        System.out.println("data changed: "+result);*/
     //---------------------------------------------------------------------------------
        //delete mathod
        /*StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
        int result = studentDao.delete(246);
        System.out.println("The record is deleted: "+result);*/
     //---------------------------------------------------------------------------------
        //for the grtting single query
        /*StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
        Student student = studentDao.getStudent(222);
        System.out.println(student);*/
        
        //---------------------------------------------------------------------------------
        //for the selecting all from the list
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
        List<Student> students = studentDao.getAllStudents();
        for(Student s: students) {
        	System.out.println(s);
        	
        }      
   }
}
