package com.entry;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="Signup_Details")
public class Signup_Process 
{
	@Column(name="First_Name")
	private String fname ;
	@Column(name="Last_Name")
	private String lname ;
	@Column(name="User_Name")
	private String username ;
	@Column(name="Password")
	private String password ;
	@Column(name="Date_Of_Birth")
	private String dob ;
	@Column(name="Email_ID")
	private String email ;
	@Id
	@Column(name="Contact")
	private String phoneno ;
	@Column(name="Degree")
	private String degree ;
	@Column(name="Branch")
	private String branch ;
	@Column(name="College_Name")
	private String collegename ;
	@Column(name="Passout_Year")
	private String passoutyear ;
	
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
	public String getFname() 
	{
		return fname;
	}
	public void setFname(String fname) 
	{
		this.fname = fname;
	}
	public String getLname() 
	{
		return lname;
	}
	public void setLname(String lname) 
	{
		this.lname = lname;
	}
	public String getDob()
	{
		return dob;
	}
	public void setDob(String dob) 
	{
		this.dob = dob;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public String getPhoneno()
	{
		return phoneno;
	}
	public void setPhoneno(String phoneno)
	{
		this.phoneno = phoneno;
	}
	public String getDegree() 
	{
		return degree;
	}
	public void setDegree(String degree) 
	{
		this.degree = degree;
	}
	public String getBranch() 
	{
		return branch;
	}
	public void setBranch(String branch) 
	{
		this.branch = branch;
	}
	public String getCollegename()
	{
		return collegename;
	}
	public void setCollegename(String collegename) 
	{
		this.collegename = collegename;
	}
	public String getPassoutyear() 
	{
		return passoutyear;
	}
	public void setPassoutyear(String passoutyear)
	{
		this.passoutyear = passoutyear;
	}
	
	public Signup_Process(String fname, String lname, String username, String password, String dob, String email,
			String phoneno, String degree, String branch, String collegename, String passoutyear) 
	{
		super();
		this.fname = fname;
		this.lname = lname;
		this.username = username;
		this.password = password;
		this.dob = dob;
		this.email = email;
		this.phoneno = phoneno;
		this.degree = degree;
		this.branch = branch;
		this.collegename = collegename;
		this.passoutyear = passoutyear;
	}
	
	
	public Signup_Process( String phoneno) 
	{
		super();
		this.phoneno = phoneno;
		
	}
	
	public Signup_Process()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString()
	{
		return "PERSON_DETAILS [ First Name = " + fname + " , Last Name = " + lname + " , Username = " + username + " , Password = "
				+ password + " , Date Of Birth = " + dob + " , Email = " + email + " , Phone Number = " + phoneno + " , Degree = " + degree
				+ " , Branch = " + branch + " , College Name = " + collegename + " , Passout Year = " + passoutyear + " ] ";
	}
	
	
	
}
