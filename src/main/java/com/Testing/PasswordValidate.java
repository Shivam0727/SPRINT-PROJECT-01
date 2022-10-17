package com.Testing;

public class PasswordValidate 
{
	private static final String VALID_PASSWORD_REGEX = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%=:\\?]).{8,12})";
	
	public static boolean validPassword(String password)
	{
	    return (password != null && password.matches(VALID_PASSWORD_REGEX));
	    
	}
}
