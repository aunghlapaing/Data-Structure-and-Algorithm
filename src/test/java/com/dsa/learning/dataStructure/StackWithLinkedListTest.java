package com.dsa.learning.dataStructure;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StackWithLinkedListTest {
	StackWithLinkedList stack = new StackWithLinkedList();
	@Test
	public void testPushSimpleCase() 
	{
		stack.push(10);
	
		assertEquals(1, stack.size());
		assertEquals(10, stack.peek());
	}
	
	@Test
	public void testPushIterateCase()
	{
		for ( int i = 0; i < 10; i++ )
		{
			stack.push(i);
		}
		assertEquals(10, stack.size());
		assertEquals(9, stack.peek());
	}
	
	@Test
	public void testPopSimpleCase()
	{
		stack.push(10);
		
		int item = stack.pop();
		assertEquals(10, item);
		assertEquals(0, stack.size());

	}
	
	@Test
	public void testPopMultipleCase()
	{
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		int item = stack.pop();
		stack.pop();
		stack.pop();
		
		assertEquals(0, stack.size());

	}
	
	@Test
	public void testPushAndPopIterateCase()
	{
		for ( int i =0; i < 10; i++ )
		{
			stack.push(i);
		}
		for ( int i = 9; i >= 0; i-- )
		{
			stack.pop();
		}
		assertEquals(0, stack.size());
	}

}
