package com.Exceptions;

public class UserNotFoundException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserNotFoundException()
	{
		super();
	}

	@Override
	public String toString() 
	{
		return "UserNotFoundException is Generated ...";
	}
	
}
