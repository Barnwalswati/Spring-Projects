package com.demo.controller;

import com.demo.dto.EmployeeDTO;
import com.demo.service.IEmployeeMgmtService;
import com.demo.vo.EmployeeVO;

public class MainController {
	//HAS-A property
	private IEmployeeMgmtService service;

	public MainController(IEmployeeMgmtService service) {
		System.out.println("MainController.1-param constructor");
		this.service = service;
	}
	//client gives input in the form of VO class
	public String processEmployee(EmployeeVO vo)throws Exception{
		//convert EmployeeVOclass obj to EmployeeDTO class
		EmployeeDTO dto = new EmployeeDTO();
		dto.setEname(vo.getEname());
		dto.setDesg(vo.getDesg());
		dto.setBasicSalary(Float.parseFloat(vo.getBasicSalary()));
		//use service
		String result =  service.registerEmployee(dto);
		return result;
	}
}
