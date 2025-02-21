package com.programming.turing_dsa.search_test;

public class LinearSearch implements SearchingAlgorithm{

	@Override
	public int search(int[] arr, int item) {
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] == item)
			{
				return i;
			}
		}
		return -1; //if item not found
	}
	
}
