package com.dsa.learning.dataStructure;

import java.util.Stack;

public class Reverser {

	public String reverse(String string) {
		
		Stack<Character> stack = new Stack<>();
		for( int i = 0; i < string.length(); i++ )
		{
			stack.push(string.charAt(i));
		}
		String result = "";
		while( !stack.isEmpty() )
		{
			result += stack.pop();
		}
		return result;
	}
	
	public static void main(String[] args)
	{
		Reverser reverser = new Reverser();
		String element = reverser.reverse("Hello");
		System.out.print("After Reverser:" + element);
	}
	

}
