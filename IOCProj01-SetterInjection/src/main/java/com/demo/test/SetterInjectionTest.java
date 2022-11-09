package com.demo.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.demo.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		//hold spring bean cfg file name and location
		FileSystemResource res = new FileSystemResource("src/main/java/com/demo/cfgs/applicationContext.xml");
		//create IOC container(BeanFactory container)
		@SuppressWarnings("deprecation")
		XmlBeanFactory factory = new XmlBeanFactory(res);
		// get target spring bean class object
		Object obj = factory.getBean("wmg");
		//typecasting
		WishMessageGenerator generator = (WishMessageGenerator)obj;
		//invoke the b.method
		String result = generator.generateMessage("Swati!!");
		System.out.println("Wishing Message is: "+result);
	}

}
