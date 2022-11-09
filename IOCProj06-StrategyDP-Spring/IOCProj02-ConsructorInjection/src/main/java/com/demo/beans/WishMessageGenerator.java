package com.demo.beans;

import java.util.Date;

public class WishMessageGenerator {

	private Date date;

	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator: 0-param constructor");
	}

	public WishMessageGenerator(Date date) {
		System.out.println("WishMessageGenerator: 1-param constructor");
		this.date = date;
	}

	public void setDate(Date date) {
		System.out.println("WishMessageGenerator: seter method");
		this.date = date;
	}
	
	//business logic
	public String generateMessage(String user) {
		System.out.println("WishMessageGenerator.generateMessage(): "+date);
		@SuppressWarnings("deprecation")
		int hour = date.getHours();
		if(hour<12) {
			return "GM: "+user;
		}
		else if(hour<16) {
			return "AF: "+user;
		}
		else if(hour<20) {
			return "GE: "+user;
		}
		else {
			return "GN: "+user;
		}
		
	}
}
