package com.dsa.learning.searchalgo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.dsa.learning.searchalgo.BinarySearchAlgo;

public class BinarySearchTest {
	
	BinarySearchAlgo algo = new BinarySearchAlgo();
	int[] array = {1, 2, 3, 4, 5, 6, 7, 10, 11};
	
	@Test
	public void simpleCase()
	{
		int input = algo.search(5, array);
		assertEquals(4, input);
 	}
	
	@Test
	public void goToLeftCase()
	{
		int input = algo.search(1, array);
		assertEquals(0, input);
	}
	
	@Test
	public void goToRightCase()
	{
		int input = algo.search(10, array);
		assertEquals(7, input);	
	}
	
	@Test 
	public void edgeCase()
	{
		int input = algo.search(11, array);
		assertEquals(8, input);
		
	}
}
