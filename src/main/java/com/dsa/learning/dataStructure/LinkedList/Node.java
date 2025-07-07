package com.dsa.learning.dataStructure.LinkedList;

public class Node {
	int value;
	Node next;
	
	public Node(int item)
	{
		this.value = item;
	}
	
	public Node setNext(Node node)
	{
		return this.next = node;
	}
	
	public int getValue()
	{
		return this.value;
	}
}
