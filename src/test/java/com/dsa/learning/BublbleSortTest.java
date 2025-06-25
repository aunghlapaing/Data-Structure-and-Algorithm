package com.dsa.learning;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.turing.dsa.util.Util;

public class BublbleSortTest {
	
	Util util = new Util();
	BubbleSortAlgo algo = new BubbleSortAlgo();
	
	@Test
	public void simpleCase()
	{
		int[] arr = {2, 1};
		algo.sort(arr);
		assertTrue(util.isArraySorted(arr));
		
	}
	
	@Test
	public void complexArray()
	{
		int[] arr = {1, 3, 4, 2, 5, 6, 8};
		algo.sort(arr);
		assertTrue(util.isArraySorted(arr));
	}
	
	@Test
	public void emptyCase()
	{
		int[] arr = {};
		algo.sort(arr);
		assertTrue(util.isArraySorted(arr));
	}

}
