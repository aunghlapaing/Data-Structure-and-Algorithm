package com.programming.turing_dsa.data_structure;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StackTest {
	Stack stack = new Stack(10);
	int size = stack.size();
	@Test
	public void testPushCase()
	{	
		stack.push(100);
		assertEquals (1, stack.size());
		
		int element = stack.peek();
		assertEquals(100, element);
	}
	
	@Test
	public void testMultiplePushCase()
	{
		stack.push(100);
		stack.push(200);
		assertEquals (2, stack.size());
		
		int element = stack.peek();
		assertEquals(200, element);
		
	}

}
