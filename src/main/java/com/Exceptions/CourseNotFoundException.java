package com.Exceptions;

public class CourseNotFoundException extends Exception
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CourseNotFoundException() 
	{
		super();
		
	}

	@Override
	public String toString() 
	{
		return "CourseNotFoundException is generated ...";
	}
	

}
