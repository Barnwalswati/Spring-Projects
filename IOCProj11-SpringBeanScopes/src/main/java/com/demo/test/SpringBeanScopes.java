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
	
		WishMessageGenerator generator3 = factory.getBean("wmg1", WishMessageGenerator.class);
		WishMessageGenerator generator4 = factory.getBean("wmg1", WishMessageGenerator.class);
		System.out.println("Hashcodes=="+generator3.hashCode()+" "+generator4.hashCode());
		System.out.println("generator3==generator4::"+(generator3==generator4));
		/*
		 * Output==>
		 *  WishMessageGenerator.0-param constructor
		    WishMessageGenerator.setDate()
			Hashcodes==564160838 564160838
			generator1==generator2::true
			==================================
			WishMessageGenerator.0-param constructor
			WishMessageGenerator.setDate()
			Hashcodes==2012232625 2012232625
			generator3==generator4::true
			s
			That proves that it behaves like singleton but doesn't make spring bean class as singleton class because it creates only one
			object for respected bean id, while Singleton class creates only one object for java class. 
		 */
		//invoke the b.method
		String result = generator1.generateMessage("Swati!!");
		System.out.println("Wishing Message is: "+result);
	}

}
