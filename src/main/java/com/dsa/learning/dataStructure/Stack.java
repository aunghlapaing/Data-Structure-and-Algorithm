package com.dsa.learning.dataStructure;

public class Stack {

	int arr[];
	public Stack(int size) {
		this.arr = new int[size];
	}
	int top = -1;

	public void push(int i) {
		// TODO Auto-generated method stub
		
		this.arr[++top] = i;
		
	}

	public Object size() {
		// TODO Auto-generated method stub
		return top+1;
	}

	public int peek() {
		// TODO Auto-generated method stub
		return this.arr[top];
	}

	public int pop(int i) {
		// TODO Auto-generated method stub
		return this.arr[top--];
	}
	
}
