package com.Array;

public class SortAscending {

	public static void main(String[] args) {
		
		
		//initialize Arrray
		int arr[]= {12,15,10,8,20,2};
		
		
		//Displaying element of the original Array
		System.out.print("Element of original array:");
		for( int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
		//Sort array in Ascending Order
		for(int i = 0; i < arr.length; i++) {
			for( int j = i+1; j<arr.length; j++)
			{
				if(arr[i] > arr[j]) {
					
				}
			}
		}

	}

}
