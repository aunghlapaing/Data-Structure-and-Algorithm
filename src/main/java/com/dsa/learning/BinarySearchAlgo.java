package com.dsa.learning;

public class BinarySearchAlgo {

	public int search(int input, int[] array) {
		
		int start = 0;
		int end = array.length - 1;	
		
		while( start <= end )
		{
			int middle = ( start + end ) / 2;
			if ( input == array[middle] )
			{
				return middle;
			}
			else if ( input > array[middle] )
			{
				start = middle + 1;
			}
			else if ( input < array[middle] )
			{
				end = middle - 1;
			}
		}
		
		return -1;
	}
	
	public static void main (String [] args)
	{
		BinarySearchAlgo algo = new BinarySearchAlgo();
		int[] array = {1, 2, 3, 4, 5, 6, 7, 10, 11};
		int input = algo.search(11, array);
		
		System.out.print(input);
				
	}

}
