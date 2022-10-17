package com.Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class DobTest 
{

	@Test
	public void test()
	{
		// For DOB Testing :
        
        String dob = "07-12-2000";
        boolean birth = DobValidate.validDob(dob);
        assertTrue(birth);
	}

}
