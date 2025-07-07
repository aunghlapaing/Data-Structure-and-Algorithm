package com.dsa.learning.dataStructure.LinkedList;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;

import org.junit.Test;

public class LinkedListTest {
	
	LinkedList list = new LinkedList();
	
	@Test
	public void testAddFirstSimpleCase()
	{
		
		list.addFirst(10);
		
		Iterator iterator = list.iterator();
		assertEquals(10, ((Node)iterator.next()).getValue());
		
	}
	
	@Test
	public void testAddFirstMultipleCase()
	{
		
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		
		//[ 30->20->10 ]
		
		Iterator iterator = list.iterator();
		assertEquals(30, ((Node)iterator.next()).getValue());
		assertEquals(20, ((Node)iterator.next()).getValue());
		assertEquals(10, ((Node)iterator.next()).getValue());
	}

}
