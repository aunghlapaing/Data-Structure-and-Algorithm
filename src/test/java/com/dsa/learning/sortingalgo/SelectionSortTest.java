package com.dsa.learning.sortingalgo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.dsa.learning.sortingalgo.SelectionSort;
import com.dsa.learning.sortingalgo.SortingAlgo;
import com.dsa.learning.sortingalgo.Util;

public class SelectionSortTest {
	Util util = new Util();
	SortingAlgo selection = new SelectionSort();
	
	@Test
	public void simpleCase()
	{
		int[] arr = {2, 1};
		selection.sort(arr);
		assertTrue(util.isSortedArray(arr));
	}
	
	@Test
	public void NullCase()
	{
		int[] arr = {};
		selection.sort(arr);
		assertTrue(util.isSortedArray(arr));
	}
	
	@Test
	public void NaNCase()
	{
		int[] arr = {-1, 1, 4 , 3, 5, 7, 6};
		System.out.println("Before Sorting:" + util.arrayToString(arr));
		selection.sort(arr);
		System.out.println("After Sotring:" + util.arrayToString(arr));
		assertTrue(util.isSortedArray(arr));
	}
	
	@Test
	public void randomArray()
	{
		int[] arr = util.createRandomArray(20);
		selection.sort(arr);
		assertTrue(util.isSortedArray(arr));
	}

}
