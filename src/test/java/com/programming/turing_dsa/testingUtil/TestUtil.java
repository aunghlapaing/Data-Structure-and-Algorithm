package com.programming.turing_dsa.testingUtil;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.programming.turing_dsa.util.Util;


public class TestUtil {
	Util util = new Util();
	
	@Test
	public void testZeroArray ()
	{
		int arr[] = {};
		assertTrue(util.isArraySorted(arr));
	}
	
	@Test
	public void testOneArray()
	{
		int arr [] = {1};
		assertTrue(util.isArraySorted(arr));
	}
	
	@Test
	public void testManyArray()
	{
		int arr[] = {1, 2, 3, 4, 5};
		assertTrue(util.isArraySorted(arr));
	}
	
	@Test
	public void testNegativeCase()
	{
		int arr[] = {2, 3, 4, 5, 1};
		assertFalse(util.isArraySorted(arr));
	}
	
	@Test
	public void testNanCase()
	{
		int arr[] = {-1, 1, 2, 3, 4, 5};
		assertTrue(util.isArraySorted(arr));
	}
}









