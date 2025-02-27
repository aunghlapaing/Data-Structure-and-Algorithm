package com.programming.turing_dsa.data_structure;

import java.util.ArrayList;
import java.util.Stack;

public class DelimiterPratice {
	ArrayList<Character> startTags = new ArrayList<> ();
	ArrayList<Character> endTags = new ArrayList<> ();
	
	public DelimiterPratice ()
	{
		startTags.add('[');
		startTags.add('{');
		
		endTags.add(']');
		endTags.add('}');
	}
	

	public boolean isValid(String input) {
		
		Stack<Character> stack = new Stack<> ();
		
		for (int i = 0; i < input.length(); i++)
		{
			Character ch = input.charAt(i);
			if (startTags.contains(ch))
			{
				stack.push(ch);
			}
			else if (endTags.contains(ch))
			{
				if (stack.isEmpty())
				{
					return false;
				}
				Character topElement = stack.pop();
				int endTagIndex = endTags.indexOf(ch);
				int startTagIndex = startTags.indexOf(topElement);
				if (endTagIndex != startTagIndex)
				{
					return false;
				}
			}
		}
		return stack.empty();
	}
	

}
