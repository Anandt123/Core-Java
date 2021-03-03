package com.jspiders.instadb;

import java.sql.SQLException;

public class Mainclass {

	public static void main(String[] args) 
	{
		instaimpl i1 = new instaimpl();
		i1.intitDb();
		Users u1 = new Users(2, "pavan", "pavan123@gmail", "pavan@12");
		try {
			//i1.Signup(u1);
			i1.Signin("anand123@gmailh", "anand@12");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		i1.closeConnection();
	}

}
