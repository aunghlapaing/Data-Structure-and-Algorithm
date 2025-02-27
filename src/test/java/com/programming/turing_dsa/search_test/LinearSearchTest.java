package com.programming.turing_dsa.search_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LinearSearchTest {
	SearchingAlgorithm searchAlgo = new LinearSearch();
	
	@Test
	public void HappyCase()
	{
		int arr[] = {1, 2, 3, 4, 5};
		int index = searchAlgo.search(arr, 1);
		assertEquals(0, index);
	}
	
	@Test
	public void MiddleCase()
	{
		int arr[] = {1, 2, 3, 5, 4};
		int index = searchAlgo.search(arr, 4);
		assertEquals(4, index);
	}
	
	@Test
	public void UnhappyCase()
	{
		int arr[] = {1, 2, 3, 4, 5};
		int index = searchAlgo.search(arr, 7);
		assertEquals(-1,index);
	}
	@Test
	public void DuplicateCase()
	{
		int arr[] = {1, 2, 3, 3, 4, 5};
		int index = searchAlgo.search(arr, 3);
		assertEquals(3,index);
	}
}
