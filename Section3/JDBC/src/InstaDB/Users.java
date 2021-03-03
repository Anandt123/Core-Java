package com.jspiders.instadb;

public class Users 
{
	private int id;
	private String name;
	private String emailid;
	private String password;
	
	public Users(int id, String name, String emailid, String password) {
		super();
		this.id = id;
		this.name = name;
		this.emailid = emailid;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
