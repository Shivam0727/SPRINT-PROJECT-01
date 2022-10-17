package com.Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContactTest 
{

	@Test
	public void test() 
	{
		String contact = "7038229942";
        boolean phoneno = ContactValidate.validContact(contact);
        assertTrue(phoneno);
	}

}
