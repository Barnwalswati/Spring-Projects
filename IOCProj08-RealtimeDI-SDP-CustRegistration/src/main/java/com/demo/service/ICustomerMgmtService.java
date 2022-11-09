package com.demo.service;

import com.demo.dto.CustomerDTO;

public interface ICustomerMgmtService {
	public String registerCustomer(CustomerDTO dto)throws Exception;
}
