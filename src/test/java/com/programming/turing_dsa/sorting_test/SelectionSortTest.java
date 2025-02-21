package com.programming.turing_dsa.sorting_test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Random;

import org.junit.jupiter.api.Test;

import com.turing.dsa.util.Util;

public class SelectionSortTest {
	Util util = new Util();
	SortingAlgorithm sortingAlgo = new SelectionSort();
	
	@Test
	public void testSimpleCase()
	{
		int arr[] = {3, 2};
		sortingAlgo.sort(arr);
		assertTrue(util.isArraySorted(arr));		
	}
	
	@Test
	public void testSortMutipleCase()
	{
		int arr[] = {3, 4, 5, 1, 6};
		sortingAlgo.sort(arr);
		assertTrue(util.isArraySorted(arr));
	}
	
	@Test
	public void testSortEmptyCase()
	{
		int arr[] = {};
		sortingAlgo.sort(arr);
		assertTrue(util.isArraySorted(arr));
	}
	
	@Test
	public void testSortRandomCase()
	{
		int[] arr = util.createRandomArray(20);
		sortingAlgo.sort(arr);
		assertTrue(util.isArraySorted(arr));	
	}
	
}
