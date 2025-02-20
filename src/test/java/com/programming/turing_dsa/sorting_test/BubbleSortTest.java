package com.programming.turing_dsa.sorting_test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Random;

import org.junit.jupiter.api.Test;

import com.turing.dsa.util.Util;

public class BubbleSortTest {
	Util util = new Util();
	SortingAlgorithm sortingAlgo = new BubbleSort();
	
	@Test
	public void testBubbleSimpleCase()
	{
		int arr[] = {3, 2};
		sortingAlgo.sort(arr);
		assertTrue(util.isArraySorted(arr));		
	}
	
	@Test
	public void testBubbleSortMutipleCase()
	{
		int arr[] = {3, 4, 5, 1, 6};
		sortingAlgo.sort(arr);
		assertTrue(util.isArraySorted(arr));
	}
	
	@Test
	public void testBubbleSortEmptyCase()
	{
		int arr[] = {};
		sortingAlgo.sort(arr);
		assertTrue(util.isArraySorted(arr));
	}
	
	@Test
	public void testBubbleSortRandomCase()
	{
		int[] arr = util.createRandomArray(20);
		sortingAlgo.sort(arr);
		assertTrue(util.isArraySorted(arr));
		
	}

	
}
