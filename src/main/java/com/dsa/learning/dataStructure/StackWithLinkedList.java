package com.dsa.learning.dataStructure;

import com.dsa.learning.dataStructure.LinkedList.*;

public class StackWithLinkedList extends LinkedList{
	int size = 0;
	
	StackWithLinkedList()
	{
		super();
	}

	public void push(int item) {
		super.addLast(item);
		this.size++;
		
	}

	public int size() {
		
		return size;
	}

	public int peek() {
		
		return super.getLast().getValue();
	}

	public int pop() 
	{
		Node lastNode = super.getLast();
		this.delete();
		this.size--;
		return lastNode.getValue();

	}

	private void delete() {
		
		Node lastNode = super.getLast();
		Node current = super.getFirst();
		Node previous = null;
		while ( lastNode != current )
		{
			previous = current;
			current = current.getNext();
		}
		if ( previous != null )
		{
			previous.setNext(null);
		}
		super.last = previous;
		
	}

}
