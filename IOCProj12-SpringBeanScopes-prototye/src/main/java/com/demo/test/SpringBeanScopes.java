package com.demo.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import com.demo.beans.WishMessageGenerator;

public class SpringBeanScopes {

	public static void main(String[] args) {
		//hold spring bean cfg file name and location
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("/com/demo/cfgs/applicationContext.xml");
		// get target spring bean class object
		WishMessageGenerator generator1 = factory.getBean("wmg", WishMessageGenerator.class);
		WishMessageGenerator generator2 = factory.getBean("wmg", WishMessageGenerator.class);
		System.out.println("Hashcodes=="+generator1.hashCode()+" "+generator2.hashCode());
		System.out.println("generator1==generator2::"+(generator1==generator2));
		
		System.out.println("==================================");
	
	}

}
