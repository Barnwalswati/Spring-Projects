package com.demo.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.demo.singleton.Printer;

public class SpringBeanScopeTest2 {

	public static void main(String[] args) {
		//hold spring bean cfg file name and location
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("/com/demo/cfgs/applicationContext.xml");
		// get target spring bean class object
		
		Printer p = factory.getBean("p", Printer.class);
		Printer p1 = factory.getBean("p", Printer.class);
		System.out.println("Hashcodes=="+p.hashCode()+" "+p1.hashCode());
		
		Printer p2 = factory.getBean("p1", Printer.class);
		Printer p3 = factory.getBean("p1", Printer.class);
		System.out.println("Hashcodes=="+p2.hashCode()+" "+p3.hashCode());
		
		
	}

}
