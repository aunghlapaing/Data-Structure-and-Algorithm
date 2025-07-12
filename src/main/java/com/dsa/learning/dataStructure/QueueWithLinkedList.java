package com.dsa.learning.dataStructure;

import com.dsa.learning.dataStructure.LinkedList.*;

public class QueueWithLinkedList extends LinkedList{
	
	int size = 0;
	
	QueueWithLinkedList()
	{
		super();
	}

	public void enQueue(int item) 
	{
		super.addLast(item);
		this.size++;
	}

	public int size() 
	{
		
		return size;
	}

	public int peek() 
	{
		Node firstNode = super.getFirst();
		while ( firstNode != null )
		{
			return super.getFirst().getValue();
		}
		return 0;
	}

	public int deQueue() 
	{
		Node firstNodeToDelete = super.first;
		Node node = super.deleteNode(firstNodeToDelete.getValue());
		System.out.println("Deleted Node:" + node.getValue());
		this.size--;
		return firstNodeToDelete.getValue();
	}

	
	
	

}
