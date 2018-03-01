package com.luv2code.springdemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;;

@Component("ThatSillyCoach")
// if we use @Component and we don't specify a idname, the dafult will be tennisCoach.
//so first letter will be lower case
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "practice of 1 hour";
		
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
