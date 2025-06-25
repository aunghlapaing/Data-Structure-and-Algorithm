package com.dsa.learning.dataStructure;

public class Stack001 {
	int top = -1;
	int arr[];
	Stack001(int size)
	{
		this.arr = new int[size];
	}

	public void push(int i) {
		this.arr[++top] = i;
	}

	public Object size() {
		
		return 1;
	}

	public int peek() {
		
		return this.arr[this.top];
	}

	public int pop() {
		
		return this.arr[top--];
	}

}
