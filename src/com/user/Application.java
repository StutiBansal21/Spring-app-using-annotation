package com.user;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		
		
		  ClassPathXmlApplicationContext applicationContext=new
		  ClassPathXmlApplicationContext("applicationContext.xml");
		 
		//AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		Employee emp = applicationContext.getBean("employee",Employee.class);
		Contact contact=emp.getContact();
		Address address=contact.getAddress();
		System.out.println("Employee Details: ");
		System.out.println("");
		System.out.println(emp.getId());
		System.out.println(contact.getFirstName()+" "+contact.getLastName());
		System.out.println(address.getHouseNo()+" "+address.getCity()+" "+address.getState());
	
	}

}
