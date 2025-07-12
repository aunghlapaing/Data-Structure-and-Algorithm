package com.dsa.learning.dataStructure.LinkedList;

public class SortedLinkedList extends LinkedList{
	
	public void add(int item) {
		
		if ( super.first == null ) // Empty Stage
		{
			super.addFirst(item);
		}
		else
		{
			Node current = this.first;
			Node previous = null;
			while ( current != null )
			{
				if ( current.value > item )
				{
					break;
				}
				previous = current;
				current = current.next;
			}
			Node insertNode = new Node(item);
			insertNode.setNext(current);
			if ( previous == null ) // insert at first
			{
				super.first = insertNode;
			}
			else // insert at last
			{
				previous.setNext(insertNode);
			}
			
			
			
		}
		
		
	}

}
