package com.dsa.learning.sorting;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.sortingalgo.Util;

public class UtilTest {
	
	Util util = new Util();
	
	@Test
	public void simpleCase()
	{
		int[] arr = {1, 2, 3};
		assertTrue(util.isSortedArray(arr));
		
	}
	
	@Test
	public void mediumCase()
	{
		int [] arr = {1, 2, 3, 4, 5, 6};
		assertTrue(util.isSortedArray(arr));
	}
	
	@Test
	public void hardCase()
	{
		int[] arr = {};
		assertTrue(util.isSortedArray(arr));
	}
	
	@Test
	public void negativeCase()
	{
		int[] arr = {1, 3, 2, 4, 5};
		assertFalse(util.isSortedArray(arr));
	}

}
