package com.dsa.learning.sorting;


import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import com.sortingalgo.InsertionSort;
import com.sortingalgo.SortingAlgo;
import com.sortingalgo.Util;


public class InsertionTest {

	Util util = new Util();
	SortingAlgo insertion = new InsertionSort();
	
	@Test
	public void simpleCase()
	{
		int[] arr = {3, 2, 1};
		System.out.println("Before Sorting: " + util.arrayToString(arr));
		insertion.sort(arr);
		System.out.println("After Sorting: " + util.arrayToString(arr));
		assertTrue(util.isSortedArray(arr));
	}
	
	@Test
	public void NullCase() 
	{
		int [] arr = {};
		insertion.sort(arr);
		assertTrue(util.isSortedArray(arr));
	}
	
	@Test
	public void NaNCase()
	{
		int [] arr = {-1, 0, 1, 3, 4, 6, 5};
		System.out.println("Before Sorting: " + util.arrayToString(arr));
		insertion.sort(arr);
		assertTrue(util.isSortedArray(arr));
		System.out.println("After Sorting: " + util.arrayToString(arr));
	}
	@Test
	public void randomCreatedArray()
	{
		int [] arr = util.createRandomArray(20);
		insertion.sort(arr);
		assertTrue(util.isSortedArray(arr));
		System.out.println("After Sorting: " + util.arrayToString(arr));
	}
}
