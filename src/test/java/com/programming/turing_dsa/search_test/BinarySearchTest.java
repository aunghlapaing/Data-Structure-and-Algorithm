package com.programming.turing_dsa.search_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {
	SearchingAlgorithm searchAlgo = new BinarySearch();
	
	@Test
	public void MiddleCase()
	{
		int arr[] = {1, 2, 3, 4, 5};
		int index = searchAlgo.search(arr, 3);
		assertEquals(2, index);
	}
	
	@Test
	public void EdgeCase()
	{
		int arr [] = {1, 2, 3, 4, 5};
		int index = searchAlgo.search(arr, 1);
		assertEquals(0, index);
	}
	
	@Test
	public void ArrayOutofBoundCase()
	{
		int arr [] = {1, 2, 3, 4, 5};
		int index = searchAlgo.search(arr, 6);
		assertEquals(-1, index);
	}
}
