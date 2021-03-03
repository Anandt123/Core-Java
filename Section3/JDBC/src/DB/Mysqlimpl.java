package com.jspiders.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Mysqlimpl implements Dao
{
	private String url = "jdbc:mysql://localhost:3306/usersdb";
	private String username = "root";
	private String password = "Anand@12";
	private Connection con;
	
	@Override
	public void intitDb() 
	{
		/*Step1 : Register the Driver to DriverManager
        and get the DB connection*/ 
		try 
		{
			con = DriverManager.getConnection(url, username, password);
			System.out.println("connection successful");
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void addName(int id, String name) throws SQLException
	{
		/*
		 Prepare the Statement(insertQuery)
		 Execute Query
		 Process the result*/
		
		String insertQuery = "insert into users values("+id+","+"'"+name+"'"+");";
		
		String insertQuery1 = "insert into users values(?,?);";
		System.out.println(insertQuery);
		
		/*Statement sm = con.createStatement();
		sm.execute(insertQuery);*/
		
		PreparedStatement pm = con.prepareStatement(insertQuery1);
		pm.setInt(1, id);
		pm.setString(2, name);
		
		pm.execute();
		
		System.out.println("data added to db");
	}
	
	@Override
	public String[] getAllName() throws SQLException 
	{
		String selectAll = "select name from users";
		Statement sm = con.createStatement();
	    ResultSet rs = sm.executeQuery(selectAll);
	      
	    while(rs.next())
	    {
	    	String s1 = rs.getString("name");
	    	System.out.println(s1);
	    }
		return null;
	}
	
	@Override
	public ArrayList<String> getAllUserNames() throws SQLException 
	{
		String selectAll = "select name from users";
	    Statement sm = con.createStatement();
	    ResultSet rs = sm.executeQuery(selectAll);
	    
	    ArrayList<String> userNames = new ArrayList<String>();
	    while(rs.next())
	    {
	    	String s1 = rs.getString("name");
	    	userNames.add(s1);
	    }
	    
		return userNames;
	}

	
	@Override
	public String getName(int id) throws SQLException
	{
		String name = " ";
		System.out.println("getting name");	
		System.out.println("id : " +id);
		
		String SelectQuery = "select name from users where id = ?";

		PreparedStatement pm = con.prepareStatement(SelectQuery);
		pm.setInt(1, id);
		ResultSet rs = pm.executeQuery();

		rs.next();//move cursor to first record

		name = rs.getString("name");//get the data from ResultSet with columnName
		
		return name;
	}

	@Override
	public void updateName(int id,String newName) throws SQLException
	{
		System.out.println("updating name");
		System.out.println("id : "+id);
		System.out.println("newName : "+newName);
		
		String UPDATEquery = "update users set name = ? where id = ?";

		PreparedStatement pm  = con.prepareStatement(UPDATEquery);
		pm.setString(1, newName);
		pm.setInt(2, id);

		int updateCount = pm.executeUpdate();

		System.out.println(updateCount +" rows updated");
	}

	@Override
	public void deleteName(int id) throws SQLException 
	{
		System.out.println("deleting name");
		System.out.println(id);
		
		String DeleteQuery = "delete from users where id = ?";
		
		PreparedStatement pm = con.prepareStatement(DeleteQuery);
		pm.setInt(1, id);
		pm.execute();
		
		System.out.println("data deleted from db");
	}

	@Override
	public void closeConnection() 
	{
		try {
			con.close();
			System.out.println("connection closed");	
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}

	

}
