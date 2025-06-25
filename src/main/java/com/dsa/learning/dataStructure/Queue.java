package com.dsa.learning.dataStructure;

public class Queue {
	int arr[];
	int tail = 0;
	int head = 0;
	
	public Queue()
	{
		this.arr = new int[5];
	}

	public int size()
	{
		return this.tail - this.head;
	}

	public void enQueue(int i) 
	{
		if( this.tail < arr.length )
		{
			this.arr[tail++] = i;
		}
		else
		{
			throw new RuntimeException ("Queue is Full");
		}
		
	}

	public int peek() {
		
		return this.arr[head];
	}

	public int deQueue() {
		if ( this.head < arr.length && this.head < this.tail )
		{
			return this.arr[head++];
		}
		else
		{
			throw new RuntimeException ("Queue is empty");
		}
		
	}

}
