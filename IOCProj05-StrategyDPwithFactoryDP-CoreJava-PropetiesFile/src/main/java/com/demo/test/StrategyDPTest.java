package com.demo.test;

import com.demo.comp.Flipkart;
import com.demo.factory.FlipkartFactory;

public class StrategyDPTest {

	public static void main(String[] args) {
		try {
			//get target class obj from factory 
			Flipkart fpkt = FlipkartFactory.createFlipkart();
			String result = fpkt.shopping(new String[] {"shirt","jeans","top"} , new float[] {2000.0f,6000.0f, 1000.0f});
			System.out.println(result);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
