package com.dsa.learning.sortingalgo;

import java.util.Arrays;

public class ShellSort implements SortingAlgo {

	@Override
	public int[] sort(int[] arr) {
		int gap = arr.length/2;
		
		while ( gap > 0 )
		{
			System.out.println("Gap value: " + gap);
			for ( int i = gap; i < arr.length; i++ )
			{
				int temp = arr[i];
				int j = i;
				while ((j >= gap ) && ( arr[j-gap] > temp) )
				{
					arr[i] = arr[j-gap];
					arr[j-gap] = temp;
					j -= gap;
				}
			}
			gap = gap/2;

		}
		System.out.println( "Result" + Arrays.toString(arr) );
		
		return arr;
	}

}
