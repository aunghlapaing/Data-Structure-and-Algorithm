package com.sortingalgo;

public class SelectionSort implements SortingAlgo {

	public void sort(int[] arr) {
		for ( int i = 0; i < arr.length - 1; i++ )
		{
			int minIndex = i;
			for ( int j = i + 1; j < arr.length; j++ )
			{
				// {2, 3, 5, 4, 7, 6}
				if ( arr[minIndex] > arr[j] )
				{
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
			
		}
	}
	
	// Time Complexity => O(n^2)

}
