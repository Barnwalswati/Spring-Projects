package com.demo.factory;

import com.demo.comp.BlueDart;
import com.demo.comp.Courier;
import com.demo.comp.DTDC;
import com.demo.comp.Flipkart;

public class FlipkartFactory {
	//static factory method supporting factory pattern
	public static Flipkart createFlipkart(String courierType) {
		// create target class obj;
		Flipkart fpkt=new Flipkart();
		Courier courier = null;
		if(courierType.equalsIgnoreCase("dtdc")) {
			courier=new DTDC();
		}
		else if(courierType.equalsIgnoreCase("blueDart")) {
			courier=new BlueDart();
		}
		else 
			throw new IllegalArgumentException("Invalid courier type");
		fpkt.setCourier(courier);
		return fpkt;
	}
}
