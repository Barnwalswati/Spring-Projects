package com.demo.beans;

import java.util.Date;

public class WishMessageGenerator {

	private Date date;
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator.0-param constructor");
	}

	public void setDate(Date date) {
		System.out.println("WishMessageGenerator.setDate()");
		this.date = date;
	}
	
	//business logic
	public String generateMessage(String user) {
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
