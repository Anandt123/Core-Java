package com.jspiders.instadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class instaimpl implements DAO
{
	private String url = "jdbc:mysql://localhost:3306/instadb";
	private String name = "root";
	private String password = "Anand@12";
	private Connection con;
	Scanner sc = new Scanner(System.in);

	@Override
	public void intitDb()
	{
		try {
			con = DriverManager.getConnection(url, name, password);
			System.out.println("--connection Successful-");
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void Signup(Users u1) throws SQLException 
	{
		String insertQuery = "insert into users values(?,?,?,?)";
		PreparedStatement pm = con.prepareStatement(insertQuery);
		pm.setInt(1,u1.getId());
		pm.setString(2,u1.getName());
		pm.setString(3,u1.getEmailid());
		pm.setString(4, u1.getPassword());
		
		pm.execute();
		System.out.println("ohh Signup successfull");
	}

	@Override
	public void Signin(String emailid, String password)  throws SQLException
	{
		String selectEmployee = "SELECT * from users where emailid = ? and password = ? ";
		PreparedStatement pm = con.prepareStatement(selectEmployee);
		pm.setString(1, emailid);
		pm.setString(2, password);
		
		ResultSet rs = pm.executeQuery();
		rs.next();
		
		String eid = rs.getString("emailid");
		String pwd = rs.getString("password");
		 
		
		try
		{
			String emailid1 = rs.getString("emailid");
			String password1 = rs.getString("password");
			System.out.println("Sign in Successful");
		}
		catch(SQLException e)
		{
			try
			{
				System.out.println("enter emailid 2nd time");
				String ss1 = sc.next();
				System.out.println("enter  pwd 2nd time");
				String ss2 = sc.next();
				 
				System.out.println("getting emailid");
				String id = rs.getString("emailid");
				System.out.println(eid.equals(ss1));
				
			}
			catch(SQLException e1)
			{
			System.out.println("invalid input");
			e.printStackTrace();
			}
		}
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
