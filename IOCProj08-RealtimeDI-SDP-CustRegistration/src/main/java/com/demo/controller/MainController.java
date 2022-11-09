package com.demo.controller;

import com.demo.dto.CustomerDTO;
import com.demo.service.ICustomerMgmtService;
import com.demo.vo.CustomerVO;

public class MainController {
	
	private ICustomerMgmtService service;

	public MainController(ICustomerMgmtService service) {
		System.out.println("MainController.1-param constructor");
		this.service = service;
	}
	//client gives input in the form of VO class
	public String processCustomer(CustomerVO vo) throws Exception {
		//convert EmployeeVOclass obj to EmployeeDTO class
		CustomerDTO dto = new CustomerDTO();
		dto.setInterest(Double.parseDouble(vo.getInterest()));
		dto.setpAmt(Double.parseDouble(vo.getpAmt()));
		dto.setTime(Double.parseDouble(vo.getTime()));
		
		String result = service.registerCustomer(dto);
		return result;
		
	}
}
