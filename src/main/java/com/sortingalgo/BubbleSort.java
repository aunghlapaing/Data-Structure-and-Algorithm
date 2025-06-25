package com.sortingalgo;

public class BubbleSort implements SortingAlgo{

	@Override
	public void sort(int[] arr) {
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

	}
	
	//Time Complexity => O(n^2)

}
