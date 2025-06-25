package com.dsa.learning.dataStructure;

import java.util.Stack;
import java.util.HashMap;

public class PostFixConverter {
	
	HashMap<Character, Integer> precedences = new HashMap<>();
	
	PostFixConverter()
	{
		this.precedences.put('+', 1);
		this.precedences.put('-', 1);
		
		this.precedences.put('*', 2);
		this.precedences.put('/', 2);
	}
	
	boolean isHigherOrEqual(char firstPrecedence, char secondPrecedence)
	{
		int FirstPrecedence = precedences.get(firstPrecedence);
		int SecondPrecedence = precedences.get(secondPrecedence);
		
		return FirstPrecedence >= SecondPrecedence; // 2 (*, /) >= 1 ( +, -) or 2 = 2
	}
	
	boolean isOperator(char ch)
	{
		return ch == '+'|| ch == '-' || ch == '*' || ch == '/';
	}
	
	boolean isOperand(char ch)
	{
		return !this.isOperator(ch) && !this.isParenthesis(ch);
	}
	
	boolean isParenthesis(char ch)
	{
		return ch == '(' || ch == ')';
	}

	
	public String toPostfix(String string) {
		
		Stack<Character> stack = new Stack<>();
		
		String postfix = "";
		for ( int i = 0; i < string.length(); i++ )
		{
			char ch = string.charAt(i);
			if ( this.isOperand(ch)  )
			{
				postfix += ch;
			}
			else if ( ch == '(' )
			{
				stack.push(ch);
			}
			
			else if ( this.isOperator(ch) )
			{
				if ( stack.isEmpty() )
				{
					stack.push(ch);
				}
				else // !stack.isEmpty()
				{
					while ( !stack.isEmpty() && stack.peek() != '(' && isHigherOrEqual(stack.peek(), ch) )
					{
						postfix += stack.pop();
					}
					stack.push(ch);
				}
			}
			else if ( ch == ')' )
			{
				/*
				 * we only want to output the operator while stack = [(,+]
				 * So we need break condition for while loop
				 * */
				while (!stack.isEmpty() && stack.peek() != '(')
				{
					postfix += stack.pop(); 
				}
				if (!stack.isEmpty())
				{
					stack.pop(); // pop (
				}
			}
		}
		while (!stack.isEmpty())
		{
			postfix += stack.pop();
		}
		
		return postfix;
	}

}
