package com.demo.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.demo.controller.MainController;
import com.demo.vo.CustomerVO;

public class CustomerTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("/com/demo/cfgs/applicationContext.xml");
		//get springBean class obj ref
		MainController controller = factory.getBean("controller", MainController.class);
		//read inputs as string values and store then into EmloyeeVO class object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal Amount: ");
		String pAmt = sc.next();
		System.out.println("Enter rate of interest");
		String interest = sc.next();
		System.out.println("Enter time");
		String time = sc.next();
		CustomerVO vo =new CustomerVO();
		vo.setpAmt(pAmt);
		vo.setInterest(interest);
		vo.setTime(time);
		try {
			String result = controller.processCustomer(vo);
			System.out.println(result);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
