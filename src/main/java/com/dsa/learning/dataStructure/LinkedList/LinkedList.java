package com.dsa.learning.dataStructure.LinkedList;

import java.util.Iterator;

public class LinkedList implements Iterable {
	protected Node first;
	protected Node last;
	
	protected LinkedList()
	{
		
	}
	
	LinkedList(Node firstNode)
	{
		this.first = firstNode;
		this.last = firstNode;
	}
	
	protected void addFirst(int item)
	{
		Node node = new Node(item);
		this.addFirst(node);
	}
	
	protected void addFirst(Node node) 
	{
		if ( this.first == null && this.last == null ) // Empty List 
		{
			this.first = node;
			this.last = node;
		}
		else // List is not empty
		{
			node.setNext(first);
			this.first = node;
		}
		
	}
	
	public Node getFirst() //return first node for the test case
	{
		return this.first ;
	}
	
	protected void addLast(int i) 
	{
		Node node = new Node(i);
		this.addLast(node);
		
	}
	
	protected void addLast(Node node)
	{
		if ( this.last == null && this.first == null )
		{
			this.last = node;
			this.first = node;
			// System.out.println("First node:" + first.getValue());
		}
		else
		{
			last.setNext(node);
			this.last = node;
		}
	}
	
	protected Node getLast() // return last node for test case 
	{
		return this.last;
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

	public int search(int item) 
	{
		Node current = first;
		while ( current != null )
		{
			if ( current.getValue() == item )
			{
				return current.getValue();
			}
			current = current.next;
		}
		
		return -1;
	}

	public Node deleteNode(int item) 
	{
		Node current = first;
		Node previous = null;
		Node deleteNode = null;
		while ( current != null )
		{
			if ( current.value == item ) // delete node found
			{
				deleteNode = current; 
				//single node
				if ( this.first == this.last )
				{
					first = deleteNode.next;
					return deleteNode;
				}
				//multiple node && last node
				else if ( previous != null )
				{
					previous.next = deleteNode.next;
					if ( deleteNode.next == null )
					{
						this.last = previous;
					}
					return deleteNode;
				}
				
			}
			previous = current;
			current = current.next;
		}
		return null;
	}

}