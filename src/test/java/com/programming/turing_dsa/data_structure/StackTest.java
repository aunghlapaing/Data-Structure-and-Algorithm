package com.programming.turing_dsa.data_structure;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StackTest {
	Stack stack = new Stack(3);
	
	@Test
	public void testSimplePushCase()
	{
		stack.push(100);
		assertEquals(1, stack.size());
		int element = stack.peek(100);
		assertEquals(100, element);
	}
	
	@Test
	public void testTwoElementPushCase ()
	{
		stack.push(200);
		stack.push(300);
		assertEquals(2, stack.size());
		int element = stack.peek(300);
		assertEquals(300, element);
	}
	
	@Test
	public void testMultiplePushCase ()
	{
		stack.push(200);
		stack.push(300);
		stack.push(400);
		assertEquals(3, stack.size());
		int element = stack.peek(400);
		assertEquals(400, element);
	}
	
//	@Test
//	public void testOutofBoundCase()
//	{
//		stack.push(200);
//		stack.push(300);
//		stack.push(400);
//		stack.push(500);
//		assertEquals(4, stack.size());
//		int element = stack.peek(500);
//		assertEquals(500, element);
//	}
	
	@Test
	public void testPopSimpleCase()
	{
		stack.push(200);
		
		int element = stack.pop(200);
		assertEquals(200, element);
		assertEquals (0, stack.size());
		
	}
	
	@Test
	public void testPopMultipleCase()
	{
		stack.push(100);
		stack.push(200);
	
		int element1 =stack.pop(200);
		int element2 = stack.pop(100);
		assertEquals(200, element1);
		assertEquals(100, element2);
		
		int size = stack.size();
		assertEquals (0, size);
	}
	
	
	
}
