package com.dsa.learning.sortingalgo;

import static org.junit.Assert.assertTrue;

import java.util.Random;

import org.junit.Test;

public class ShellSortTest {
	
	SortingAlgo algo = new ShellSort();
	
	Util util = new Util();
	//@Test
	public void testSortSimpleCase()
	{
		int [] arr = {5, 3};
		int [] result = algo.sort(arr);
		
		assertTrue(util.isSortedArray(result));
	}
	
	//@Test
	public void testSortMultipleItemCase()
	{
		int [] arr = {5, 3, 4, 1, 2, 6, 10};
		int [] result = algo.sort(arr);
		
		assertTrue(util.isSortedArray(result));
	}
	
	@Test
	public void testSortWithRandomDataCase()
	{
		Random random = new Random();
		int [] arr = new int[20];
 		for ( int i = 0; i < arr.length; i++ )
		{
			arr[i] = random.nextInt(200);
		}
 		int[] result = algo.sort(arr);
 		assertTrue( util.isSortedArray(result) );
	}

}
