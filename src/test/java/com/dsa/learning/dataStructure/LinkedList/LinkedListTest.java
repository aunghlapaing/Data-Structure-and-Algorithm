package com.dsa.learning.dataStructure.LinkedList;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;

import org.junit.jupiter.api.Test;

public class LinkedListTest {
	
	LinkedList list = new LinkedList();
	
	@Test
	public void firstPointerInsertCase()
	{
		
		Node first = new Node(10);
		Node second = new Node(20);
		Node third = new Node (30);
		
		list.addFirst(first);
		list.addFirst(second);
		list.addFirst(third);
		
		Iterator iterator = list.iterator();
		
		assertEquals(third, iterator.next());
		assertEquals(second, iterator.next());
		assertEquals(first, iterator.next());
		
	}
	
	@Test
	public void addFirstandIterateCase()
	{
		
		for ( int i = 0; i < 10; i++ )
		{
			list.addFirst(new Node(i));
		}
		
		int i = 9;
		Iterator iterator = list.iterator();
		//[9->8->...->1]
		while ( iterator.hasNext() )
		{
			Node node = (Node) iterator.next();
			assertEquals(i--, node.getValue());
		}
	}
	
	@Test
	public void lastPointerInsertCase()
	{
		Node first = new Node (10);
		Node second = new Node (20);
		
		list.addLast(first);
		list.addLast(second);
		
		Iterator iterator = list.iterator();
		assertEquals(first, iterator.next());
		assertEquals(second, iterator.next());
		
	}
	
	@Test
	public void addFirstAndaddLastMixedCase()
	{
		Node first = new Node (10);
		Node second = new Node (20);
		Node third = new Node (30);
		
		list.addLast(first);
		list.addLast(second);
		list.addFirst(third);
		
		Iterator iterator = list.iterator();
		assertEquals(third, iterator.next());
		assertEquals(first, iterator.next());
		assertEquals(second, iterator.next());
	}
	
	@Test
	public void addLastandIterateCase()
	{
		
		for ( int i = 0; i < 10; i++ )
		{
			list.addLast(new Node(i));
		}
		
		int i = 0;
		Iterator iterator = list.iterator();
		//[0->..->9]
		while ( iterator.hasNext() )
		{
			Node node = (Node) iterator.next();
			assertEquals(i++, node.getValue());
		}
	}
	
	@Test
	public void findCase()
	{
		list.addFirst(10);
		list.addFirst(20);
		
		Node item = list.find(20);
		assertEquals(20, item.getValue());
	}

}
