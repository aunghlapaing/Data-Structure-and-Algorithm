package com.programming.turing_dsa.util;

import java.util.Random;

public class Util {
	public boolean isArraySorted(int [] arr) 
	{
		for (int i = 0; i < arr.length-1; i++)
		{
			if (arr[i] > arr[i+1])
			{
				return false;
			}
		}
		return true;
	}
	
	public int[] createdRandomArray(int size) {
		Random random = new Random ();
		int arr [] = new int[size];
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = random.nextInt(50);
		}
		return arr;
	}
}
