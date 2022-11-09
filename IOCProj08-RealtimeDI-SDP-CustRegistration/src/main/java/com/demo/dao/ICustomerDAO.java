package com.demo.dao;

import com.demo.bo.CustomerBO;

public interface ICustomerDAO {
	public int insertCustomer(CustomerBO bo)throws Exception;
}
