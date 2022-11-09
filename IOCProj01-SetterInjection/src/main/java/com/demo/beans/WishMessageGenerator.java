package com.demo.beans;

import java.util.Date;

public class WishMessageGenerator {

	private Date date;

	public void setDate(Date date) {
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
