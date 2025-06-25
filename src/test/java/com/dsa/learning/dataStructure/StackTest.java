package com.dsa.learning.dataStructure;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StackTest {
	
	Stack stack = new Stack(10);
	
	@Test
	public void simpleCase()
	{
		stack.push(100);
		assertEquals(1, stack.size());
		
		int element = stack.peek();
		assertEquals(100, element);
		
		int pop_element = stack.pop(100);
		assertEquals(100, pop_element);
	}
	
	@Test
	public void multipleElementCase()
	{
		stack.push(100);
		stack.push(200);
		stack.push(300);
		
		assertEquals(3, stack.size());
		
		int element = stack.peek();
		assertEquals(300, element);
		
		int pop_element = stack.pop(300);
		assertEquals(300, pop_element);
		
		
	}
	

}
