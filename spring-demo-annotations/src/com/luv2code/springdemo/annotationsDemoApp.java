package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class annotationsDemoApp {
	
	/* Demo used to describe constructor, Setter and Field Injection 
	  and the main difference is that you write Autowired annotaion 
	  above constructor, setter method or attribute*/
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		context.close();
		
	}

}
