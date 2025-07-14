package com.dsa.learning.recursion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.dsa.learning.recursion.Factorial;

public class FactorialTest {
	
	Factorial fact = new Factorial();
	
	@Test
	public void testZeroFactorialCase()
	{
		int item = fact.factorial(0);
		
		assertEquals(1, item);
	}
	
	@Test
	public  void testFactorialCase()
	{
		int item = fact.factorial(3);
		
		assertEquals(6, item);
		assertEquals(24, fact.factorial(4));
	}

}
