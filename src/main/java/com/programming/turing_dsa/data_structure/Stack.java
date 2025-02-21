package com.programming.turing_dsa.data_structure;

public class Stack {
	int arr[];
	Stack (int size)
	{
		this.arr = new int [size];
	}

	public int size() {
		
		return top+1;
	}
	
	int top = -1;
	public void push(int item) {
		this.arr[++this.top] = item;
		
	}

	public int peek() {
		return this.arr[top];
	}
	

}
