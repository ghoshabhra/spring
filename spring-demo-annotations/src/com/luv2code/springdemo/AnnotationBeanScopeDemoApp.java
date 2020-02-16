package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
//		Coach theCoach_2 = context.getBean("tennisCoach", Coach.class);
		
		System.out.println(theCoach);
//		System.out.println(theCoach_2);
		context.close();
	}

}
