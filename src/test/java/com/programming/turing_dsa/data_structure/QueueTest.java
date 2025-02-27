package com.programming.turing_dsa.data_structure;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.Test;

public class QueueTest {
	QueuePratice queue = new QueuePratice();
	
	@Test
	public void testEnqueue()
	{
		queue.enqueue(10);
		assertEquals(10, queue.peek());
		
		int size = queue.size();
		assertEquals(1, size);
	}
	
	@Test
	public void testEnqueueTwoItem()
	{
		queue.enqueue(10);
		queue.enqueue(20);
		assertEquals(10, queue.peek());
		
		int size = queue.size();
		assertEquals(2, size);
	}
	
	@Test 
	public void testDequeue()
	{
		queue.enqueue(10);
		queue.enqueue(20);
		assertEquals(10, queue.peek());
		
		int element = queue.dequeue();
		element = queue.dequeue();
		
		assertEquals(20, element);
		
		int size = queue.size();
		assertEquals(0, size);
	}
	
	@Test
	public void testBoundaryCase()
	{
		for (int i = 0; i < 5; i++)
		{
			queue.enqueue(i);
		}
		assertEquals(0, queue.peek());
		for (int i = 0; i < 5; i++)
		{
			int element = queue.dequeue();
			assertEquals(i, element);
		}
		assertEquals(0, queue.size());
	}
	
	@Test
	public void testOutOfBoundDequeueCase()
	{
		queue.enqueue(10);
		queue.enqueue(20);
		assertEquals(10, queue.peek());
		
		int element = queue.dequeue();
		queue.dequeue();
		
		RuntimeException error = assertThrows (RuntimeException.class, ()->{
			queue.dequeue();
		});
		assertEquals("Queue is empty", error.getMessage());
		
		assertEquals(10, element);
		
		int size = queue.size();
		assertEquals(0, size);
	}
	
	@Test
	public void TestEnqueueOutOfBoundCase()
	{
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		
		assertEquals(10, queue.peek());
		
		
		RuntimeException error = assertThrows (RuntimeException.class, ()->{
			queue.enqueue(60);;
		});
		assertEquals("Queue is full", error.getMessage());
		
		int size = queue.size();
		assertEquals(5, size);
	}

}
