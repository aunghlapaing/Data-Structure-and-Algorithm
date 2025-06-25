package com.dsa.learning.dataStructure;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class CircularQueueTest {
	Queue queue = new CircularQueue();
	
	@Test
	public void simpleCase()
	{
		queue.enQueue(100);

		assertEquals(1, queue.size());
		
		int element = queue.peek();
		assertEquals(100, element);
		
	}
	
	@Test
	public void testMultipleEnqueCase()
	{
		queue.enQueue(100);
		queue.enQueue(200);
		
		assertEquals(2, queue.size());
		
		int element = queue.peek();
		assertEquals(100, element);
		
	}
//	
	@Test
	public void testDequeCase()
	{
		queue.enQueue(100);
		queue.enQueue(200);
		
		queue.deQueue();
		
		assertEquals(1, queue.size());
		
		int element = queue.peek();
		assertEquals(200, element);
	}
//	
	@Test
	public void testBoundaryEnQueueCase()
	{
		for ( int i = 0; i < 5; i++ )
		{
			queue.enQueue(i);
		}
		assertEquals(5, queue.size());
		
		RuntimeException exception = assertThrows( RuntimeException.class,()->{
			queue.enQueue(6);
		} );
		assertEquals("Queue is Full", exception.getMessage());
	}

	@Test
	public void testBoundaryDeQueueCase()
	{
		for ( int i = 0; i < 5; i++ )
		{
			queue.enQueue(i);
		}
		assertEquals(5, queue.size());
		
		RuntimeException exception = assertThrows( RuntimeException.class,()->{
			queue.enQueue(6);
		} );
		assertEquals("Queue is Full", exception.getMessage());
		
		for ( int i = 0; i < 5; i++ )
		{
			queue.deQueue();
		}
		assertEquals(0, queue.size());
		
		RuntimeException error = assertThrows( RuntimeException.class,()->{
			queue.deQueue();
		} );
		assertEquals("Queue is empty", error.getMessage());
	}
	
	@Test
	public void circularQueueEnqueueTest()
	{
		for (int i = 0; i < 5; i++)
		{
			queue.enQueue(i);
		}
		assertEquals(5, queue.size());
		RuntimeException exception = assertThrows(RuntimeException.class, ()->{
			queue.enQueue(6);
		});
		assertEquals("Queue is Full", exception.getMessage());
			
	}
}
