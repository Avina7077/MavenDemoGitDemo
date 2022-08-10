package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExceptionsTest {

	
	@Test
	public void testmethodexp()
	{
		Calculator c = new Calculator();
		final Exception e = assertThrows(ArithmeticException.class,
				()->{c.searchEmp(0);});
		
		Assertions.assertEquals("u entered zero", e.getMessage());
	}
		
	
	}


