package com.programming.turing_dsa.data_structure;

public class QueuePratice {
	int arr[];
	int tail = 0;
	int head = 0;
	public QueuePratice ()
	{
		this.arr = new int [5];
	}

	public void enqueue(int i) 
	{
		if (this.tail < this.arr.length)
		{
			this.arr[this.tail++] = i;
		}
		else 
		{
			throw new RuntimeException ("Queue is full");
		}
		
	}

	public int size() {
		return this.tail - this.head;
	}

	public int peek() {
		return this.arr[head];
	}

	public int dequeue() {
		if (this.head < this.arr.length && this.head < this.tail)
		{
			return this.arr[this.head++];	
		}
		else
		{
			throw new RuntimeException ("Queue is empty");
		}
	}

}
