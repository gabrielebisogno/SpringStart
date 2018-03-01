package com.luv2code.springdemo;
import java.util.Random;
public class SuperFortune implements FortuneService {

	private String array[] = new String[] {"God","Legend","Master Chief"};
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		Random random = new Random();
		int i =  random.nextInt(2);
		return "i am really super fortunate like a " +array[i];
	}

}
