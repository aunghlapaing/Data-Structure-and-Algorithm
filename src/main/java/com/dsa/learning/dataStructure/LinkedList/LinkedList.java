package com.dsa.learning.dataStructure.LinkedList;

import java.util.Iterator;

public class LinkedList implements Iterable {
	Node first;
	Node last;
	
	LinkedList()
	{
		
	}
	
	LinkedList(Node firstNode)
	{
		this.first = firstNode;
		this.last = firstNode;
	}
	
	public void addFirst(int item)
	{
		Node node = new Node(item);
		this.addFirst(node);
	}
	
	public void addFirst(Node node) 
	{
		if ( first == null ) // Empty List 
		{
			this.first = node;
		}
		else // List is not empty
		{
			node.setNext(first);
			this.first = node;
		}
		
	}

	@Override
	public Iterator iterator() 
	{
		return new ListIterator();
	}
	
	class ListIterator implements Iterator
	{

		Node current;
		ListIterator()
		{
			this.current = first;
		}
		@Override
		public boolean hasNext() {
			
			return current != null;
		}

		@Override
		public Node next() {
			Node temp = current; // Single Node
			if ( current != null ) // current hasNext
			{
				current = current.next;
			}
			return temp;
		}
	}

}
