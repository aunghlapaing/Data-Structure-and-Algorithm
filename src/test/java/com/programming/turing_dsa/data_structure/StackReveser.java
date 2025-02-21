package com.programming.turing_dsa.data_structure;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StackReveser {
	Reverser reverser = new Reverser();
	
	@Test
	public void testEmptyCase()
	{
		String output = reverser.reverse("");
		assertEquals("", output);
	}
	
	@Test
	public void testSimpleCase()
	{
		String output = reverser.reverse("s");
		assertEquals("s", output);
	}

	@Test
	public void testMutipleCase()
	{
		String output = reverser.reverse("car");
		assertEquals("rac", output);
		
		output = reverser.reverse("programmer");
		assertEquals("remmargorp", output);
	}
	
}
