package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.demo.bo.CustomerBO;

public class CustomerDAOImpl implements ICustomerDAO {
	
	private static final String CUS_INSERT_QUERY = "INSERT INTO SPRING_CUSTOMER(PAMT,INTEREST,TIME,SINTEREST) VALUES(?,?,?,?);";
	//HAS-A PROPERTY
	private DataSource ds;
	
	public CustomerDAOImpl(DataSource ds) {
		System.out.println("CustomerDAOImpl.1-param constructor");
		this.ds = ds;
	}
	
	@Override
	public int insertCustomer(CustomerBO bo) throws Exception {
		int result = 0;
		try(Connection con = ds.getConnection();
				PreparedStatement ps = con.prepareStatement(CUS_INSERT_QUERY);){
			ps.setDouble(1, bo.getpAmt());
			ps.setDouble(2, bo.getInterest());
			ps.setDouble(3, bo.getTime());
			ps.setDouble(4, bo.getsInterest());
			result = ps.executeUpdate();
		}
		catch(SQLException se) {
			se.printStackTrace();
			throw se;
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		return result;
	}
	
	

}
