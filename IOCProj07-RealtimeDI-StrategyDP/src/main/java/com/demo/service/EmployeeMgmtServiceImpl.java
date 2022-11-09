package com.demo.service;

import com.demo.bo.EmployeeBO;
import com.demo.dao.IEmployeeDAO;
import com.demo.dto.EmployeeDTO;

public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService{
	
	private IEmployeeDAO dao;
	
	public EmployeeMgmtServiceImpl(IEmployeeDAO dao) {
		System.out.println("EmployeeMgmtSeviceImpl.1-param constructor");
		this.dao = dao;
	}

	@Override
	public String registerEmployee(EmployeeDTO dto) throws Exception {
		//write b.logic to calculate grossSalary and netSalary
		float grossSalary = dto.getBasicSalary()+dto.getBasicSalary()*0.4f;
		float netSalary = grossSalary - dto.getBasicSalary()*0.2f;
		//prepare BO class obj having persistable data
		EmployeeBO bo = new EmployeeBO();
		bo.setEname(dto.getEname());
		bo.setDesg(dto.getDesg());
		bo.setBasicSalary(dto.getBasicSalary());
		bo.setGrossSalary(grossSalary);
		bo.setNetSalary(netSalary);
		//use DAO
		int count = dao.insertEmployee(bo);
		return count==1?"Employee registered with netSalary::"+netSalary:"Employee not registered with netSalary::"+netSalary;
	}

}
