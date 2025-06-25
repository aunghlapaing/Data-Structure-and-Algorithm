package com.dsa.learning.dataStructure.LinkedList;

import java.util.Iterator;

public class LinkedList implements Iterable {

	Node first;
	Node Last;
	
	LinkedList()
	{
		
	}
	
	LinkedList(Node node)
	{
		this.first = node;
		this.Last = node;
	}
	
	public void addFirst(int item)
	{
		Node node = new Node(item);
		this.addFirst(node);
	}
	
	public void addFirst(Node firstNode) 
	{
		if ( this.first == null )
		{
			this.first = firstNode;
			this.Last = firstNode;
		}
		else
		{
			firstNode.setNext(first);
			this.first = firstNode;
		}

	}
	
	public void addLast(Node lastNode)
	{
		if (this.Last == null)
		{
			this.Last = lastNode;
			this.first = lastNode;
		}
		else
		{
			this.Last.setNext(lastNode);
			this.Last = lastNode;
		}
		
	}
	
	@Override
	public Iterator iterator() {
		
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
			
			return this.current != null;
		}

		@Override
		public Node next() {
			Node temp = current;
			if ( current != null )
			{
				current = current.next;
			}
			return temp;
		}
		
	}

	public Node find(int item) 
	{
		Node current = this.first;
		while( current != null )
		{
			int currentValue = current.value;
			if ( currentValue == item )
			{
				return current;
			}
			current = current.next;
		}

		return null;
	}
	
	public static void main(String [] args)
	{
		Node first = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		
		first.setNext(second);
		second.setNext(third);
		
		LinkedList list = new LinkedList();
		
		list.addFirst(first);
		Iterator iterator = list.iterator();
		
		while (iterator.hasNext())
		{
			Node node = (Node) iterator.next();
			System.out.println("Value :" + node.getValue());
		}
		
	}

	
	
}
