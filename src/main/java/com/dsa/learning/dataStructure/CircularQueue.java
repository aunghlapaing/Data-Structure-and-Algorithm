package com.dsa.learning.dataStructure;

public class CircularQueue extends Queue {
	
	int size;
	public int size()
	{
		return this.size;
	}

	
	public void enQueue(int i) 
	{
		if( !isFull() )
		{
			this.tail = tail % arr.length;
			this.arr[tail++] = i;
			this.size++;
		}
		else 
		{
			throw new RuntimeException ("Queue is Full");
		}
	}


	private boolean isFull() {
		return this.tail == arr.length;
	}

	public int peek() {
		
		return this.arr[head];
	}

	public int deQueue() {
		if ( !isEmpty() )
		{
			this.head = head % arr.length;
			this.size--;
			return this.arr[head++];
		}
		else
		{
			throw new RuntimeException ("Queue is empty");
		}
	}


	private boolean isEmpty() {
		return this.size == 0;
	}

}
