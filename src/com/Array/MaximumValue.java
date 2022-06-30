package com.Array;

public class MaximumValue {

	public static void main(String[] args) {
		
		
		int arr[] = {100, 105, 110, 115, 120};
		
		int max = arr[0];
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] > max)
				max = arr[i];
		}
			System.out.println("Largest element of a given Array:" + max);
		
	

	}
}


