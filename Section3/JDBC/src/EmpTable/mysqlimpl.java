package com.jspiders.empdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class mysqlimpl implements DAO
{
	private String url = "jdbc:mysql://localhost:3306/usersdb";
	private String username = "root";
	private String password = "Anand@12";
	private Connection con;

	@Override
	public void intitDb()  
	{
		
		try {
			con = DriverManager.getConnection(url, username, password);
			System.out.println("-----connection successful---");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void addEmployee(Employee emp) throws SQLException 
	{
		
		
		String insertQuery = "insert into emp values(?,?,?,?,?,?,?)";
		System.out.println(insertQuery);
		PreparedStatement pm = con.prepareStatement(insertQuery);
		pm.setInt(1,emp.getEmpno());
		pm.setString(2,emp.getEname());
		pm.setString(3, emp.getJob());
		pm.setString(4, emp.getHiredate());
		pm.setInt(5, emp.getSal());
		pm.setInt(6, emp.getComm());
		pm.setInt(7, emp.getDeptno());
		
		pm.execute();
		
		System.out.println(emp.toString());
		
		System.out.println("Data added to Database...");
	}

	@Override
	public Employee getEmployee(int empno) throws SQLException 
	{
		String selectEmployee = "SELECT * from usersdb.emp where empno = ? ";
		PreparedStatement pm = con.prepareStatement(selectEmployee);
		pm.setInt(1, empno);
		
		ResultSet rs = pm.executeQuery();
		rs.next();
		int eid = rs.getInt("empno");
		String name = rs.getString("ename");
		String job = rs.getString("job");
		String hiredate = rs.getString("hiredate");
		int sal = rs.getInt("sal");
		int comm = rs.getInt("comm");
		int deptno = rs.getInt("deptno");
		
		Employee emp = new Employee(eid, name, job, hiredate, comm, sal, deptno);
		
       return emp;		
		//String name = rs.getString("ename");
		//System.out.println(name);
	}

	@Override
	public void updateEmployeename(int empno, String newName) throws SQLException 
	{
		String UPDATEquery = "update usersdb.emp set ename = ? where empno = ?";

		PreparedStatement pm  = con.prepareStatement(UPDATEquery);
		pm.setString(1, newName);
		pm.setInt(2, empno);

		int updateCount = pm.executeUpdate();

		System.out.println(updateCount +" rows updated");
	}

	@Override
	public void deleteEmployee(int empno) throws SQLException 
	{
		String deleteEmp = "DELETE from usersdb.emp where empno = ?";
		PreparedStatement pm = con.prepareStatement(deleteEmp);
		pm.setInt(1, empno);
		int count = pm.executeUpdate();
		System.out.println(count+" rows delete");
	}

	@Override
	public void closeConnection() 
	{
		
			try {
				con.close();
				System.out.println("------connection closed-----");	
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		
	}

	
	
}
