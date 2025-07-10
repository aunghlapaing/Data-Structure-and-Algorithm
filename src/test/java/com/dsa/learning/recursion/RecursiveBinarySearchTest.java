package com.dsa.learning.recursion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class RecursiveBinarySearchTest {
	
		RecursiveBinarySearch algo = new RecursiveBinarySearch();
		
		int [] arr = {1, 3, 5, 6, 8, 10};
		
		@ParameterizedTest
		@CsvSource(value={
						"1, 0" ,
						"5, 2",
						"10,5",
						"11, -1"
					
					})
		void testSearchWithParamerizedTest(int item, int expected) {
			int searchItem = algo.binarySearch(arr, item, 0, arr.length-1);
			assertEquals(expected, searchItem);
		}
}
