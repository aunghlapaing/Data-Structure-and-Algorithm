package com.dsa.learning.dataStructure;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Stack001Test {
	
	@Test
	public void simpleCase()
	{
		Stack001 stack = new Stack001(10);
		stack.push(100);
		
		assertEquals(1, stack.size());
		
		int element = stack.peek();
		assertEquals(100, element);
		
		int input = stack.pop();
		assertEquals(100, input);
	}

}
