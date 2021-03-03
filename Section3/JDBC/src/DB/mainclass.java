package com.jspiders.db;

import java.sql.SQLException;

public class mainclass {

	public static void main(String[] args) 
	{
		Mysqlimpl m1 = new Mysqlimpl();
		m1.intitDb();
		try 
		{
			
			/*m1.addName(6,"karthik");
			System.out.println("before update...");
			String s1 = m1.getName(3);
			System.out.println(s1);
			
			System.out.println("after update...");
			m1.updateName(2, "anand");
			String s2 = m1.getName(2);
			System.out.println(s2);
			
			m1.deleteName(2);*/
			System.out.println("-getting AllNames-");
			m1.getAllName();
			System.out.println("-getting AllUserNames using ArrayList<String>-");
			m1.getAllUserNames();
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		m1.closeConnection();
	}

}
