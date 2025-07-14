package com.dsa.learning.sortingalgo;

import com.dsa.learning.sortingalgo.Util;

public class InsertionSort implements SortingAlgo {

	public int[] sort(int[] arr) {
		for ( int i =1 ; i < arr.length; i++ )
		{
			int j = i;
			while ( j > 0 && arr[j] < arr[j-1] )
			{
				int temp = arr [j];
				arr[j] = arr[j-1];
				arr [j-1] = temp;
				j--;
			}	
		}
		return arr;
	}
	
	public static void main(String[] args)
	{
		SortingAlgo insertion = new InsertionSort();
		Util util = new Util();
		int [] arr = {5, 4, 3, 2, 1};
		insertion.sort(arr);
		System.out.println("After Sorting: " + util.arrayToString(arr));
	}

}
