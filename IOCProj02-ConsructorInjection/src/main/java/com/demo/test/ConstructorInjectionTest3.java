package com.demo.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.demo.beans.WishMessageGenerator;

public class ConstructorInjectionTest3 {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("/com/demo/cfgs/applicationContext.xml");
		WishMessageGenerator generator = factory.getBean("wmg", WishMessageGenerator.class);
		//invoke the b.method
		String result = generator.generateMessage("Swati!!");
		System.out.println("Wishing Message is: "+result);
		
	}

}
  