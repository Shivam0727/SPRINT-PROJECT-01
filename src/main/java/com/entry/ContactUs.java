package com.entry;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Contact_Us")
public class ContactUs 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Unique_ID")
	private int uniqueid ;
	@Column(name="Full_Name")
	private String fullname ;
	@Column(name="Email_Id")
	private String emailid ;
	@Column(name="Contact")
	private String phoneno ;
	@Column(name="Place")
	private String place ;
	@Column(name="Message")
	private String message ;
	
	public int getUniqueid()
	{
		return uniqueid;
	}
	public void setUniqueid(int uniqueid)
	{
		this.uniqueid = uniqueid;
	}
	public String getFullname() 
	{
		return fullname;
	}
	public void setFullname(String fullname) 
	{
		this.fullname = fullname;
	}
	public String getEmailid() 
	{
		return emailid;
	}
	public void setEmailid(String emailid) 
	{
		this.emailid = emailid;
	}
	public String getPhoneno() 
	{
		return phoneno;
	}
	public void setPhoneno(String phoneno) 
	{
		this.phoneno = phoneno;
	}
	public String getPlace()
	{
		return place;
	}
	public void setPlace(String place)
	{
		this.place = place;
	}
	public String getMessage() 
	{
		return message;
	}
	public void setMessage(String message) 
	{
		this.message = message;
	}
	
	public ContactUs(String fullname, String emailid, String phoneno, String place, String message) 
	{
		super();
		this.fullname = fullname;
		this.emailid = emailid;
		this.phoneno = phoneno;
		this.place = place;
		this.message = message;
	}
	
	public ContactUs() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ContactUs(String phoneno) 
	{
		super();
		this.phoneno = phoneno;
	}
	
	@Override
	public String toString() 
	{
		return "ContactUs [ Full Name = " + fullname + " , Email-ID = " + emailid + " , Phone Number = " + phoneno + " , Place = " + place
				+ " , Messege = " + message + " ]";
	}
	
	
	
	
}
