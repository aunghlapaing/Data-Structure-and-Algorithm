package com.dsa.learning.sortingalgo;

public class BubbleSort implements SortingAlgo{

	@Override
	public int[] sort(int[] arr) {
		for ( int i = 0; i < arr.length; i++ )
		{
			for ( int j = 0; j < arr.length - (i + 1); j++ )
			{
				if ( arr[j] > arr[j+1] )
				{
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;

	}
	
	//Time Complexity => O(n^2)

}
