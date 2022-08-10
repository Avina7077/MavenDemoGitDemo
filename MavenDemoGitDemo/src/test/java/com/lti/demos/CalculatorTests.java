package com.lti.demos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTests {
	Calculator c = new Calculator();
	
	@Test
	public void testCalcSayHello()
	{
		Assertions.assertEquals("Hello World", c.sayHello());
	}


	}



