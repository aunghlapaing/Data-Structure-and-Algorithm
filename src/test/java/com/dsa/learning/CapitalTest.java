package com.dsa.learning;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.dsa.learning.Capital;

public class CapitalTest {
	
	Capital str = new Capital();
	
	@Test
	public void emptyCase() 
	{
		String output = str.toCapital("");
		assertEquals("", output);
	}
	
	@Test
	public void nullCase()
	{
		String output = str.toCapital(null);
		assertEquals("", output);
	}
	
	@Test
	public void singleWordCase()
	{
		String output = str.toCapital("apple");
		assertEquals("Apple", output);
	}
	
	@Test
	public void multipleWordsCase()
	{
		String output = str.toCapital("hello world");
		assertEquals("Hello World", output);
	}

}
