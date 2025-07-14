package com.dsa.learning.dataStructure.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.Iterator;

import org.junit.Test;

import com.dsa.learning.dataStructure.LinkedList.LinkedList;
import com.dsa.learning.dataStructure.LinkedList.Node;


public class LinkedListIteratorTest {
	
	@Test
	public void testIteratorSimpleCase()
	{
		LinkedList list = new LinkedList();
		list.addFirst(10);
		
		Iterator iterator = list.iterator();
		assertEquals(10, ((Node)iterator.next()).getValue());
		assertFalse(iterator.hasNext());
	}
	
	@Test
	public void testIteratorAddManyCase()
	{
		
		Node first = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		
		/*
		 * addFirst order
		 * [third->second-first]
		 */

		third.setNext(second);
		second.setNext(first);
		
		LinkedList list = new LinkedList();
		
		list.addFirst(third);
		
		Iterator iterator = list.iterator();
		
		assertEquals(third, iterator.next());
		assertEquals(second, iterator.next());
		assertEquals(first, iterator.next());
		assertFalse(iterator.hasNext());
	}

}
