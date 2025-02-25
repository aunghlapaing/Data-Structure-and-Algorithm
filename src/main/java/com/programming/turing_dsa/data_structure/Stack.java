package com.programming.turing_dsa.data_structure;

public class Stack {

	int arr[];
	Stack(int size)
	{
		this.arr = new int[size];
	}
	
	int top = -1;
	public int size() {
		return top+1;
	}

	public int push(int item) {
		return this.arr[++this.top] = item;
		
	}
	
	public int peek(int i) {
		return this.arr[top];
	}

	public int pop(int item) {
		return this.arr[this.top--];
	}
	
	public boolean isEmpty()
	{
		return this.arr[top] == -1;
		
	}

}
