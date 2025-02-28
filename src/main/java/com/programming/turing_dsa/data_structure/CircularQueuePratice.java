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
	
	boolean isFull()
	{
		return this.size == arr.length;
	}
	
	public void enqueue(int item)
	{
		if (!this.isFull())
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
	boolean isEmpty()
	{
		return this.size == 0;
	}
	public int dequeue()
	{
		if (!this.isEmpty())
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
