package com.dsa.learning.sorting;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import com.dsa.learning.sortingalgo.Util;
import com.turing.dsa.sorting.MergeSort;

public class MergeSortTest {
	
	MergeSort algo = new MergeSort();
	
	Util util = new Util();
	
	@Test
	public void testMergeEqualCase()
	{
		MergeSort algo = new MergeSort();
	
		int []arr1 = {1,4};
		int []arr2 = {1,2,5};
		int result[] = algo.merge(arr1,arr2); //[1,1,2,4,5]
		assertTrue(util.isSortedArray(result));
	}
	
	@Test
	public void testSortSimpleCase() 
	{
		int [] arr = { 3, 2, 1 };
		int [] result = algo.sort(arr);

		assertTrue( util.isSortedArray(result));
	}
	
	@Test
	public void testMergeUnEqualSizeTwo()
	{
		int []arr1 = {1,4,7,9};
		int []arr2 = {1,2,5};
		int result[] = algo.merge(arr1,arr2);
		assertTrue(util.isSortedArray(result));
	}

}
