package com.Exceptions;

public class ContactNotFoundException extends Exception
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ContactNotFoundException() 
	{
		super();
		
	}

	@Override
	public String toString() 
	{
		return "ContactNotFoundException is generated ...";
	}
	

}
