package com.demo.dao;

import java.sql.*;

import javax.sql.DataSource;

import com.demo.bo.EmployeeBO;

public class EmployeeDAOImpl implements IEmployeeDAO {
	private static final String EMP_INSERT_QUERY = "INSERT INTO REALTIMEDI_SPRING_EMPLOYEE(ENAME,DESG,BASICSALARY,GROSSSALARY,NETSALARY) VALUES(?,?,?,?,?);";
	//HAS-A property
	private DataSource ds;
	
	public EmployeeDAOImpl(DataSource ds) {
		this.ds = ds;
	}
	
	public int insertEmployee(EmployeeBO bo) throws Exception {
		int result = 0;
		try(Connection con = ds.getConnection();
				PreparedStatement ps = con.prepareStatement(EMP_INSERT_QUERY);	){
			//set values to query params
			ps.setString(1, bo.getEname());
			ps.setString(2, bo.getDesg());
			ps.setFloat(3, bo.getBasicSalary());
			ps.setFloat(4, bo.getGrossSalary());
			ps.setFloat(5, bo.getNetSalary());
			//execute the query
			result = ps.executeUpdate();
		}
		catch(SQLException se) {
			se.printStackTrace();
			throw se; // rethrowing exception
		}
		catch(Exception e) { 
			e.printStackTrace();
			throw e;
		}
		return result;		
	}
	/*public int insertEmployee(EmployeeBO bo) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		try {
			//get Pooled JDBC con obj
			con = ds.getConnection();
			//create Prepared statement object having query as the pre-compiled SQL query
			ps = con.prepareStatement(EMP_INSERT_QUERY);
			//set values to query params
			ps.setString(1, bo.getEname());
			ps.setString(2, bo.getDesg());
			ps.setFloat(3, bo.getBasicSalary());
			ps.setFloat(4, bo.getGrossSalary());
			ps.setFloat(5, bo.getNetSalary());
			//execute the query
			result = ps.executeUpdate();
		}
			se.printStackTrace();
			throw se; // rethrowing exception
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		finally {
			try {
				if(ps!=null)
					ps.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
			try {
				if(con!=null)
					con.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
		}
		return result;
	}*/

}
