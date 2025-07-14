package com.dsa.learning.dataStructure;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.dsa.learning.dataStructure.Reverser;

public class ReverserTest {
	
	@Test
	public void simpleCase()
	{
		Reverser reverser = new Reverser();
		
		String element = reverser.reverse("car");
		assertEquals("rac", element);
	}
	
	@Test
	public void MultipleCase()
	{
		Reverser reverser = new Reverser();
		
		String element = reverser.reverse("Hello");
		assertEquals("olleH", element);
	}
}
