package com.programming.turing_dsa.algo;

import java.util.Stack;

class BoundedStack<T> {
    private Stack<T> stack;
    private int capacity;

    public BoundedStack(int capacity) {
        this.stack = new Stack<>();
        this.capacity = capacity;
    }

    public boolean push(T item) {
        if (stack.size() < capacity) {
            stack.push(item);
            return true;
        }
        return false;
    }

    public T pop() {
        return stack.isEmpty() ? null : stack.pop();
    }

    public boolean isFull() {
        return stack.size() == capacity;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void printStack() {
        System.out.println("Stack contents: " + stack);
    }
}

public class StackTransfer {
    public static void main(String[] args) {
        BoundedStack<String> stackOne = new BoundedStack<>(3);
        BoundedStack<String> stackTwo = new BoundedStack<>(4);
        int top = 1;

        while (!stackTwo.isFull()) {
            // Step 1: Push 3 elements into stackOne
            while (!stackOne.isFull()) {
                stackOne.push("Item" + top++);
                System.out.println("Pushed to stackOne");
            }
            stackOne.printStack();
            
            // Step 2: If stackOne is full, pop and push to stackTwo
            while (!stackOne.isEmpty() && !stackTwo.isFull()) {
                String item = stackOne.pop();
                stackTwo.push(item);
                System.out.println("Moved " + item + " to stackTwo");
            }
        }
        System.out.println("stackTwo is now full. Algorithm terminates.");
        
        // Print stackOne at final stage
        System.out.println("Final state of stackOne:");
        stackOne.printStack();
    }
}

