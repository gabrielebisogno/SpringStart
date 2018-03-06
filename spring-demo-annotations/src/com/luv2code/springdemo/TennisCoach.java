package com.luv2code.springdemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;;

@Component
// if we use @Component and we don't specify a idname, the dafult will be tennisCoach.
//so first letter will be lower case
public class TennisCoach implements Coach {
	
	
	@Autowired
	//it use java reflection and directly set this attribute
	@Qualifier("randomFortuneService") 
	//describe the bean,
	//resolve problem for different implementations of FortuneService
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println("TennisCoach: inside constructor");
	}
	/*
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/

	@Override
	public String getDailyWorkout() {
		
		return "practice of 1 hour";
		
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}
	
	//@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("TennisCoach: inside setFortuneService");
		this.fortuneService = fortuneService;
	}

	
}
