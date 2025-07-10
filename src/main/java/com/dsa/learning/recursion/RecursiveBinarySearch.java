package com.dsa.learning.recursion;

public class RecursiveBinarySearch {

	public int binarySearch(int arr[], int item, int left, int right)
	{
		
		if ( left > right )
		{
			return -1;
		}
		else
		{
			int middle = ( left + right ) / 2;
			if ( arr[middle] == item )
			{
				return middle;
			}
			else if ( arr[middle] < item )
			{
				return binarySearch(arr, item, middle+1, right);
			}
			else 
			{
				return binarySearch(arr, item, left, middle-1);
			}
		}	
	}
}
