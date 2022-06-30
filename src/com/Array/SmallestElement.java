package com.Array;

public class SmallestElement {

	public static void main(String[] args) {
		int[] arr = {120, 125, 25, 50, 40, 35};
		int min = arr[0];
		for(int i = 0; i< arr.length; i++)
		{
			if(arr[i] < min)
				min = arr[i];
			
		}
		  System.out.println("Smallest element present in given array: " + min);  
	}

}
