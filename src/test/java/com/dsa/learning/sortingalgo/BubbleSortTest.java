package com.dsa.learning.sorting;

import static org.junit.Assert.assertTrue;

import java.util.Random;

import org.junit.Test;

import com.dsa.learning.sortingalgo.BubbleSort;
import com.dsa.learning.sortingalgo.SortingAlgo;
import com.dsa.learning.sortingalgo.Util;

public class BubbleSortTest {

	Util util = new Util();
	SortingAlgo bubble = new BubbleSort();
	
	@Test
	public void simpleCase()
	{
		int[] arr = {2, 1};
		bubble.sort(arr);
		assertTrue(util.isSortedArray(arr));
	}
	
	@Test
	public void nullCase()
	{
		int[] arr = {};
		bubble.sort(arr);
		assertTrue(util.isSortedArray(arr));
	}
	
	@Test
	public void NaNCase()
	{
		int[] arr = {-1, 1, 2, 3, 4, 6};
		bubble.sort(arr);
		assertTrue(util.isSortedArray(arr));
	}
	
	@Test
	public void randomArray()
	{
		int[] arr = util.createRandomArray(30);
		bubble.sort(arr);
		assertTrue(util.isSortedArray(arr));
	}

}
