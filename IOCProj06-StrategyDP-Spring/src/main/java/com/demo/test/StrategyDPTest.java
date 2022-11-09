package com.demo.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.demo.comp.Flipkart;

public class StrategyDPTest {

	public static void main(String[] args) {
		//create IOC contrainer
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/demo/cfgs/applicationContext.xml");
		//get target class object
		Flipkart fpkt = factory.getBean("fpkt", Flipkart.class);
		//invoke the b.method
		String resultMsg = fpkt.shopping(new String[] {"shirt","top","glasses"}, new float[] {5000.0f,3000.0f,4500.0f});
		System.out.println(resultMsg);
	}

}
