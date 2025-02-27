package com.programming.turing_dsa.data_structure;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StackPraticeTest {
	StackPratice stack = new StackPratice(2);
	@Test
	public void testEmptyCase()
	{
		int size = stack.size();
		assertEquals(0, size);
		
	}
	@Test
	public void testPushElement()
	{
		int element = stack.push(100);
		assertEquals(100, element);
		
		int size = stack.size();
		assertEquals(1,size);
	}
	@Test
	public void testPopElement()
	{
		int element = stack.push(100);
		assertEquals(100, element);
		
		element = stack.pop(100);
		assertEquals(100, element);
		
		int size = stack.size();
		assertEquals(0, size);
	}
	@Test
	public void testPeekElement()
	{
		int element = stack.push(100);
		assertEquals(100, element);
		
		element = stack.peek(100);
		assertEquals(100, element);
	}

}
