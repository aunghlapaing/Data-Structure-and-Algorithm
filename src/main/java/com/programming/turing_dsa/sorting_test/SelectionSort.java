package com.programming.turing_dsa.sorting_test;

public class SelectionSort implements SortingAlgorithm{

	@Override
	public void sort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++)
		{
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++)
			{
				if (arr [j] < arr [i])
				{
					arr[j] = arr [minIndex];
				}
				int temp = arr [minIndex]; 
				arr [minIndex] = arr [i]; 
				arr [i + 1] = temp;
			}
		}
		
	}

}
