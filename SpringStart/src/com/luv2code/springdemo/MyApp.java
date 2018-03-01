 package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {

//	 	load sprig config file
			ClassPathXmlApplicationContext context =
					new ClassPathXmlApplicationContext("applicationContext.xml");
		
			// 	retrieve bean from spring container
			TrackCoach theCoach =  context.getBean("myCoach", TrackCoach.class);
			
			// call methods on the bean
			System.out.println(theCoach.getDailyFortune());
			
			System.out.println(theCoach.getDailyWorkout());
			
			// close the context
			context.close();
	}

}
