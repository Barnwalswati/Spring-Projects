package com.demo.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.comp.Flipkart;

public class StrategyDPTest {

	public static void main(String[] args) {
		//create IOC contrainer (ClassPathXmlApplicationContext is recommended while working with xml and annotation+xml driven configurations)
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/com/demo/cfgs/applicationContext.xml");
		//get target class object
//		Flipkart fpkt = ctx.getBean("fpkt", Flipkart.class);
//		//invoke the b.method
//		String resultMsg = fpkt.shopping(new String[] {"shirt","top","glasses"}, new float[] {5000.0f,3000.0f,4500.0f});
//		System.out.println(resultMsg);
	}

}
