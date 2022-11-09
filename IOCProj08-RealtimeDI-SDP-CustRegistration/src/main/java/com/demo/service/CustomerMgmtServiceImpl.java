package com.demo.service;

import com.demo.bo.CustomerBO;
import com.demo.dao.ICustomerDAO;
import com.demo.dto.CustomerDTO;

public class CustomerMgmtServiceImpl implements ICustomerMgmtService {
	
	private ICustomerDAO dao;
	
	public CustomerMgmtServiceImpl(ICustomerDAO dao) {
		System.out.println("CustomerMgmtServiceImpl.1-param constructor");
		this.dao = dao;
	}

	@Override
	public String registerCustomer(CustomerDTO dto) throws Exception {
		//b.logic
		Double sInterest = dto.getpAmt()*dto.getInterest()*dto.getTime()*0.01;
		//prepare BO class obj having persistable data
		CustomerBO bo = new CustomerBO();
		bo.setpAmt(dto.getpAmt());
		bo.setInterest(dto.getInterest());
		bo.setTime(dto.getTime());
		bo.setsInterest(sInterest);
		//use DAO
		int count = dao.insertCustomer(bo);
		
		return count==1?"Customer registered successfully with Simple Interest"+sInterest:"Customer not registered with Simple Interest"+sInterest;
	}

}
