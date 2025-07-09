package com.dsa.learning.dataStructure.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;

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
		assertFalse(iterator.hasNext());
		
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
		assertFalse(iterator.hasNext());
	}
	
	@Test
	public void testAddFirstIterateCase()
	{
		for ( int i = 0; i < 10; i++ )
		{
			list.addFirst(i);
		}
		int i = 9;
		Iterator iterator = list.iterator();
		assertEquals(i--, ((Node)iterator.next()).getValue());
	}

	
	@Test
	public void testAddLastSimpleCase()
	{
		list.addLast(10);
		
		Iterator iterator = list.iterator();
		assertEquals(10, ((Node)iterator.next()).getValue());
		assertFalse(iterator.hasNext());
	}
	
	@Test
	public void testAddLastMultipleCase()
	{
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		
		// [ 10->20->30 ]
		
		Iterator iterator = list.iterator();
		assertEquals(10, ((Node)iterator.next()).getValue());
		assertEquals(20, ((Node)iterator.next()).getValue());
		assertEquals(30, ((Node)iterator.next()).getValue());
		assertFalse(iterator.hasNext());
	}
	
	@Test 
	public void testAddFirstAndAddLastMixedCase()
	{
		list.addFirst(10);
		list.addLast(20);
		list.addLast(30);
		list.addFirst(5);
		
		// [5->10->20->30]
		
		Iterator iterator = list.iterator();
		
		assertEquals(5, ((Node) iterator.next()).getValue());
		assertEquals(10, ((Node) iterator.next()).getValue());
		assertEquals(20, ((Node) iterator.next()).getValue());
		assertEquals(30, ((Node) iterator.next()).getValue());
		assertFalse(iterator.hasNext());
	}
	
	@Test
	public void testAddLastIterateCase()
	{
		for ( int i = 0; i < 10; i++ )
		{
			list.addLast(i);
		}
		int i = 0;
		Iterator iterator = list.iterator();
		assertEquals(i++, ((Node)iterator.next()).getValue());
	}
	
	@Test
	public void testSearchSingleItemCase()
	{
		list.addFirst(10);
		
		int item = list.search(10);
		assertEquals(10, item);
	}
	
	@Test
	public void testSearchMultipleItemCase()
	{
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		
		// [30->20->10]
		
		int item = list.search(10);
		assertEquals(10, item);
	}
	
	@Test
	public void testSearchMultipleItemNegativeCase()
	{
		list.addFirst(10);
		list.addFirst(20);
		
		assertEquals(-1, list.search(30));
	}

	@Test
	public void testDeleteFirstNodeCase()
	{
		list.addFirst(10);
		
		assertEquals(10, ((Node)list.deleteNode(10)).getValue());
	}
	
	@Test
	public void testDeleteFirstMultipleNodeCase()
	{
		list.addFirst(10);
		list.addFirst(50);
		list.addFirst(40);
		list.addFirst(40);
		
		// [ 40->40->50->10 ]
		
		assertEquals(10, ((Node)list.deleteNode(10)).getValue());
		assertEquals(50, ((Node)list.deleteNode(50)).getValue());
		assertEquals(40, ((Node)list.deleteNode(40)).getValue());
		
		Iterator iterator = list.iterator();
		
		assertEquals(40 , ((Node)iterator.next()).getValue());
		assertEquals(40, ((Node)list.getFirst()).getValue());
	}
	
	@Test
	public void testDeleteMiddleNodeCase() 
	{
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		
		// [30->20->10]

		assertEquals(20, ((Node)list.deleteNode(20)).getValue());
		
		// [30->10]
		
		Iterator iterator = list.iterator();
		
		assertEquals(30, ((Node)iterator.next()).getValue());
		assertEquals(10, ((Node)iterator.next()).getValue());
		assertFalse(iterator.hasNext());
	}
	
	@Test
	public void testDeleteLastNode()
	{
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		
		// [10->20->30]
		
		assertEquals(30, ((Node)list.deleteNode(30)).getValue());
		
		Iterator iterator = list.iterator();
		
		assertEquals(10, ((Node)iterator.next()).getValue());
		assertEquals(20, ((Node)iterator.next()).getValue());
		assertEquals(20, ((Node)list.getLast()).getValue());
		assertFalse(iterator.hasNext());
	}
	
	@Test
	public void testDeleteOutofBoundCase()
	{
		list.addLast(10);
		
		Node node = list.deleteNode(20);
		
		assertEquals(null, node);	
		
		Iterator iterator = list.iterator();
		assertEquals(10, ((Node)iterator.next()).getValue());
		assertFalse(iterator.hasNext());
	}
	
	@Test
	public void testDeleteLastNodeOutOfBoundCase()
	{
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		
		// [10->20->30]
		
		Node node = list.deleteNode(40);
		
		assertEquals(null, node);
		
		Iterator iterator = list.iterator();
		
		assertEquals(10, ((Node)iterator.next()).getValue());
		assertEquals(20, ((Node)iterator.next()).getValue());
		assertEquals(30, ((Node)iterator.next()).getValue());
		assertFalse(iterator.hasNext());
	}
	
}
