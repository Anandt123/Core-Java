package com.jspiders.empdb;

import java.sql.SQLException;

public interface DAO 
{
	public void intitDb() throws SQLException;
	
	public void addEmployee(Employee emp) throws SQLException;
	
	public Employee getEmployee(int empno) throws SQLException;
	
	public void updateEmployeename(int id, String newName)throws SQLException;
	
	public void deleteEmployee(int empno)throws SQLException;
	
	public void closeConnection() throws SQLException;
}
