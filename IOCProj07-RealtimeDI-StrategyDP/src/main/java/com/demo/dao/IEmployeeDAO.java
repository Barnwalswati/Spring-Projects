package com.demo.dao;

import com.demo.bo.EmployeeBO;

public interface IEmployeeDAO {
	public int insertEmployee(EmployeeBO bo) throws Exception;
}
