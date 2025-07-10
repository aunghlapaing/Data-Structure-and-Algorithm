package com.dsa.learning.recursion;

public class Factorial {

	public int factorial(int item) {
		
		if (item == 0)
		{
			return 1;
		}
		else
		{
			return item*factorial(item-1);
		}
	}

}
