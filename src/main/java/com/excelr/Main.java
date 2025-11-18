package com.excelr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		//IOC STARTS
 ApplicationContext	con=new ClassPathXmlApplicationContext("config.xml");
 
 
      //call getBean for Student
    Student  s1=con.getBean("st",Student.class);
    System.out.println(s1);
    
    System.out.println("Bye Bye");

		    System.out.println("Iam ebuz");


		System.out.println("first msg from student central");

	}

}
