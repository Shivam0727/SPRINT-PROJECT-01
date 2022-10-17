package com.Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class PasswordTest 
{

	@Test
	public void test() 
	{
		// For Password Testing :
		
		String password = "Shivam@07"; 
		boolean pass = PasswordValidate.validPassword(password);
        assertTrue(pass);
         
	}

}
