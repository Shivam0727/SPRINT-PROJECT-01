package com.Testing;

public class ContactValidate 
{
	private static final String VALID_CONTACT_REGEX = "^\\d{10}$";
	
	public static boolean validContact(String contact)
	{
	    return (contact != null && contact.matches(VALID_CONTACT_REGEX));
	    
	}
	
}
