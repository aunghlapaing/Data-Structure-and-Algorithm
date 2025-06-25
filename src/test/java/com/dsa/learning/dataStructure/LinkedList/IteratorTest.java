package com.dsa.learning.dataStructure.LinkedList;



import static org.junit.Assert.assertEquals;

import java.util.Iterator;

import org.junit.Test;

public class IteratorTest {
	
	@Test
	public void testIterator()
	{
		
		Node first = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		
		first.setNext(second);
		second.setNext(third);
		
		LinkedList list = new LinkedList();
		
		list.addFirst(first);
		
		Iterator iterator = list.iterator();
		assertEquals(first, iterator.next());
		assertEquals(second, iterator.next());
		assertEquals(third, iterator.next());
		
		
	}
	

}
