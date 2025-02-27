package com.programming.turing_dsa.data_structure;

public class StackPratice {
	int arr[];
	StackPratice(int size){
		this.arr = new int[size];
	}
	
	int top = -1;
	public int size() {
		return top+1;
	}

	public int push(int i) {
		return this.arr[++this.top] = i;
	}

	public int pop(int i) {
		return this.arr[this.top--];
	}

	public int peek(int i) {
		return this.arr[top];
	}

}
