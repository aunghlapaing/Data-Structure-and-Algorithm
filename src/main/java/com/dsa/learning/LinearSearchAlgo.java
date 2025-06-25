package com.dsa.learning;

public class LinearSearchAlgo {

	public int search(int[] array, int input) 
	{
		for ( int i = 0; i < array.length; i++ )
		{
			if ( input == array [i] )
			{
				return i;
			}
		}
		return -1;
	}

}
