package com.programming.turing_dsa.search_test;

public class BinarySearch implements SearchingAlgorithm{

	@Override
	public int search(int[] arr, int item) {
		int start = 0;
		int end = arr.length -1; 
		while (start <= end)
		{
			int middleIndex = (start + end) / 2; 
			if (item == arr[middleIndex] )
			{
				return middleIndex;
			}
			else if (item > arr[middleIndex])
			{
				start = middleIndex + 1;
			}
			else if (item < middleIndex)
			{
				end = middleIndex - 1;
			}
		}
		
		return -1;
	}

}
