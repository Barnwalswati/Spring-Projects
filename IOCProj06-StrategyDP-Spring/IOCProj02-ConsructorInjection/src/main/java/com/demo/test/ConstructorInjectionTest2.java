package com.demo.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;


import com.demo.beans.WishMessageGenerator;

public class ConstructorInjectionTest2 {

	public static void main(String[] args) {
		//hold spring bean cfg file name and location
		ClassPathResource res = new ClassPathResource("/com/demo/cfgs/applicationContext.xml");
		//create IOC container(BeanFactory container)
		@SuppressWarnings("deprecation")
		XmlBeanFactory factory = new XmlBeanFactory(res);
		WishMessageGenerator generator = factory.getBean("wmg", WishMessageGenerator.class);
		//invoke the b.method
		String result = generator.generateMessage("Swati!!");
		System.out.println("Wishing Message is: "+result);
		
	}

}
