package com.dsa.learning.dataStructure;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.Test;

public class QueueWithLinkedLisTest {
	
	QueueWithLinkedList queue = new QueueWithLinkedList();
	
	@Test
	public void testEnQueueSimpleCase()
	{
		queue.enQueue(10);
		
		assertEquals(1, queue.size());
		assertEquals(10, queue.peek());
	}
	
	@Test
	public void testEnQueueMultileCase()
	{
		queue.enQueue(10);
		queue.enQueue(20);
		
		assertEquals(2, queue.size());
		assertEquals(10, queue.peek());
	}
	
	@Test
	public void testDeQueueSimpleCase()
	{
		queue.enQueue(10);
		int item = queue.deQueue();
		
		assertEquals(10, item);
		
		assertEquals(0, queue.size());
		assertEquals(0, queue.peek());
	}
	
	@Test
	public void testDeQueueMultipleCase()
	{
		queue.enQueue(10);
		queue.enQueue(20);
		int item = queue.deQueue();
		
		assertEquals(10, item);
		assertEquals(20, queue.deQueue());
		
		assertEquals(0, queue.size());
	}
	
	@Test
	public void testEnDequeueAndEnQueueIterateCase()
	{
		for ( int i = 1; i < 10; i++ )
		{
			queue.enQueue(i);	
		}
		for ( int j = 1; j < 10; j++ )
		{
			System.out.println( "Dequeue Loop Item :" + j );
			
			int item = queue.deQueue();
			assertEquals(j, item);		
		}			
	}
}
