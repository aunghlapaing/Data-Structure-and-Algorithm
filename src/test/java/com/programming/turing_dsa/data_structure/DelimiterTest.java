package com.programming.turing_dsa.data_structure;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


public class DelimiterTest {
	DelimiterPratice delimiter = new DelimiterPratice();
	
	@Test
	public void testEmptyCase()
	{
		boolean valid = delimiter.isValid("");
		
		assertTrue(valid);
	}
	
	@Test
	public void testSingleInput() 
	{
		boolean valid = delimiter.isValid("a[b]");
		
		assertTrue(valid);
	}
	
	@Test
	public void testNegativeCase()
	{
		assertFalse(delimiter.isValid("a{b"));
	}
	@Test
	public void testMultipleNegativeCase()
	{
		assertFalse(delimiter.isValid("a{b}c]"));
	}
}
