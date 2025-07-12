package com.dsa.learning.dataStructure.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Iterator;
import java.util.Random;

import org.junit.Test;

public class SortedLinkedListTest {
	
	SortedLinkedList list = new SortedLinkedList();

	@Test
	public void testSimpleItemSortCase()
	{
		list.add(10);
		
		Iterator iterator = list.iterator();
		assertEquals(10, ((Node)iterator.next()).getValue());
	}
	
	@Test
	public void testLastSortCase()
	{
		list.add(10);
		list.add(20);
		list.add(30);
		
		// [10->20->30]
		
		Iterator iterator = list.iterator();
		assertEquals(10, ((Node)iterator.next()).getValue());
		assertEquals(20, ((Node)iterator.next()).getValue());
		assertEquals(30, ((Node)iterator.next()).getValue());

	}
	
	@Test
	public void testFirstSortCase()
	{
		list.add(20);
		list.add(10);
		
		// [10->20]
		
		Iterator iterator = list.iterator();

		assertEquals(10, ((Node)iterator.next()).getValue());
		assertEquals(20, ((Node)iterator.next()).getValue());
		
	}
	
	@Test
	public void testSortWithRandomCase()
	{
		Random random = new Random();
		
		for ( int i = 0; i < 10; i++ )
		{
			int randomData = random.nextInt(100);
			list.add(randomData);
		}
		Iterator iterator = list.iterator();
		int previous = Integer.MIN_VALUE;
		while ( iterator.hasNext() )
		{
			Node node = (Node) iterator.next();
			assertTrue( previous <= node.getValue() );
			previous = node.getValue();
		}
		
	}

}
