package com.programming.turing_dsa.sorting_test;

public class BubbleSort implements SortingAlgorithm {

	@Override
	public void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr.length-1-i; j++)
			{
				if (arr[j] > arr[j+1])
				{
					//swap
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

}
