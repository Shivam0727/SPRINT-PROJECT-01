package com.Testing;

public class DobValidate 
{
	private static final String VALID_DOB_REGEX ="[0123]\\d-[01]*[012]-\\d{4}";
	
	public static boolean validDob(String dob)
	{
	    return (dob != null && dob.matches(VALID_DOB_REGEX));
	    
	}
}
