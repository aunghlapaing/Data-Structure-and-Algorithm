package com.dsa.learning;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LinearSearchTest {
	
	LinearSearchAlgo algo = new LinearSearchAlgo();
	int[] array = {1, 2, 3, 4, 5, 10};
	
	@Test
	public void easyCase()
	{
		int input = algo.search(array, 1);
		assertEquals(0, input);	
	}
	
	@Test 
	public void mediumCase()
	{
		int input = algo.search(array, 3);
		assertEquals(2, input);
	}
	
	@Test
	public void hardCase()
	{
		int input = algo.search(array, 100);
		assertEquals(-1, input);
	}
}
