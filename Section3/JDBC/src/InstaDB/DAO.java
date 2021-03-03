package com.jspiders.instadb;

import java.sql.SQLException;


public interface DAO 
{
	public void intitDb() throws SQLException;
	
	public void Signup(Users u1) throws SQLException;
	
	public void Signin(String emailid,String password) throws SQLException;
	
	public void closeConnection() throws SQLException;
}
