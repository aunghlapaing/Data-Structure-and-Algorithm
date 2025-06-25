package com.dsa.learning;

public class BubbleSortAlgo {
	
	public int sort(int[] array)
	{
		int temp;
		for ( int i = 0; i < array.length; i++ )
		{
			for ( int j = 0; j < array.length - (i+1); j++ )
			{
				if ( array[j] > array[ j + 1 ] )
				{
					temp = array[ j + 1 ];
					array[j] = array[ j + 1 ];
					temp = array[j];
					
				}
			}	
		}
		return -1;
	}

}
