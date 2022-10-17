package com.entry;

public class Login_Process 
{
	private String username ;
	private String password ;
	
	public String getUsername() 
	{
		return username;
	}
	public void setUsername(String username)
	{
		this.username = username;
	}
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}
	
	public Login_Process(String username, String password) 
	{
		super();
		this.username = username;
		this.password = password;
	}
	
	public Login_Process() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() 
	{
		return " LOGIN_PROCESS [ Username = " + username + " , Password = " + password + " ]";
	}
	
}
