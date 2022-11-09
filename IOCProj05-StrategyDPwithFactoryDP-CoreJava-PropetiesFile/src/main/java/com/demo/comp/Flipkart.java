package com.demo.comp;

import java.util.Arrays;
import java.util.Random;

//target class
public class Flipkart {
	//HAS-A property of type interface
	private Courier courier;  
	public Flipkart() {
		System.out.println("Flipkart: 0-param constructor");
	}
	public void setCourier(Courier courier) {
		System.out.println("Flipkart.setCourir(.) ");
		this.courier = courier;
	}
	
	public String shopping(String items[],float price[]) {
		//calculate billAmt (b.logic)
		float billAmt = 0.0f;
		for(int i=0;i<items.length; i++) {
			billAmt=billAmt+price[i];
		}
		//generating order id 
		int oid = new Random().nextInt(100000);
		String status = courier.deliver(oid);
		String finalMsg = Arrays.toString(items)+"are purchsed wit prices"+Arrays.toString(price)+". The generated billAmount is::"+billAmt;
						
		return finalMsg+": "+status;
	}
	
}
