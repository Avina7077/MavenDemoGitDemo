package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestBeforeAfter {
	Calculator c = new Calculator();
	int sum=0;
	
	@BeforeAll
	public static void testStartDbconn()
	
	{
	System.out.println("opening db coonection");
	}
	@BeforeEach// before each test case
	public void testStartup()
	{
		sum=0;
		System.out.println("sum is zero"+" " +sum);
	}

	@Test
	public void testAddTwoNos()
	{
		int result = c.addNos(100, 200);
		Assertions.assertEquals(300, result);
		
	}
	@Test
	public void testSubTwoNos()
	{
		int result = c.subNos(300, 100);
		Assertions.assertEquals(200, result,"plz check substraction code");
		
	}
	@AfterEach
	public void testShutDown()
	{
		System.out.println("some object null");
	}
	
	@AfterAll //execute only once
	public static void  testShutdownConn()
	{
		System.out.println("shutting down db connection");
		
	}
	
	}


