package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.MyConfig;
import com.entity.Employee;

public class MainClass {

	public static void main(String[] args) {

//		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
//		Employee emp = context.getBean("emp", Employee.class);
////		Country con = context.getBean("con", Country.class);
//
////		System.out.println(con);
//		System.out.println(emp);
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		Employee e = context.getBean("emp", Employee.class);
		System.out.println(e);
		
	}

}