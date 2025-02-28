package com.programming.turing_dsa.data_structure;

public class CircularQueuePratice extends QueuePratice{
	int size = 0;
	public CircularQueuePratice()
	{
		super();
	}
	
	public int size(int size)
	{
		return this.size;
	}
	
	public void enqueue(int item)
	{
		if (this.size != this.arr.length)
		{
			this.tail = this.tail % this.arr.length; //circular enqueue
			this.arr[this.tail++] = item;
			this.size ++;
		}
		else 
		{
			throw new RuntimeException ("Circular Queue is full");
		}
		
		
 	}
	
	public int dequeue()
	{
		if (this.size > 0)
		{
			this.head = this.head % this.arr.length;
			this.size --;
			return this.arr[this.head++];
		}
		else
		{
			throw new RuntimeException ("Circular Queue is empty");
		}
		
	}
}
