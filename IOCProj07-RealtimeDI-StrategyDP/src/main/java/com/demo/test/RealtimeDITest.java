package com.demo.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.demo.controller.MainController;
import com.demo.vo.EmployeeVO;

public class RealtimeDITest {

	public static void main(String[] args) {
		//create IOC container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("/com/demo/cfgs/applicationContext.xml");
		
		//get springBean class obj ref
		MainController controller =factory.getBean("controller",MainController.class);
		
		//read inputs as string values and store then into EmloyeeVO class object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Name:");
		String name = sc.next();
		System.out.println("Enter Employee designation:");
		String desg = sc.next();
		System.out.println("Enter Employee BasicSalary:");
		String basicsalary = sc.next();
		EmployeeVO vo = new EmployeeVO();
		vo.setEname(name);
		vo.setDesg(desg);
		vo.setBasicSalary(basicsalary);
		
		//incoke methods
		try {
			String result = controller.processEmployee(vo);
			System.out.println(result);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
