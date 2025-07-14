package com.dsa.learning.sorting;

public class MergeSort {

	public int[] sort(int[] input) {
		
		int[] result = null;
		
		System.out.println( "Input array lenght:" + input.length );
		if ( input.length > 1 )
		{
			
			int middle = input.length / 2;
			
			int k = 0;
			
			int [] arr1 = new int[middle];
			
			for( int i = 0; i < arr1.length; i++ )
			{
				arr1[i] = input[k++];
			}
			
			int [] arr2 = new int[input.length - middle];
			
			for ( int j = 0; j < arr2.length; j++ )
		    { 
				arr2[j] = input[k++];
		    }
			
			arr1 = this.sort(arr1);
			arr2 = this.sort(arr2);
			
			result = this.merge(arr1,arr2);
			
			return result;
			
		}
		else
		{
			return result;
		}
	}

	public int[] merge(int[] arr1, int[] arr2) {
		
		int [] result = new int[ arr1.length + arr2.length ];
		int i = 0;
		int j = 0;
		int k = 0;
		
		while ( i < arr1.length && j < arr2.length)
		{
			if ( arr1[i] == arr2[j] ) // arr1 and  arr2 are equal
			{
				result[k++] = arr1[i++];
				result[k++] = arr2[j++];
			}
			else if ( arr1[i] < arr2[j] )
			{
				result[k++] = arr1[i++];
			}
			else
			{
				result[k++] = arr2[j++];
			}
		}
		while ( i < arr1.length )
		{
			result[k++] = arr1[i++];
		}
		while ( j < arr2.length )
		{
			result[k++] = arr2[j++];
		}
		
		return result;
	}

}
