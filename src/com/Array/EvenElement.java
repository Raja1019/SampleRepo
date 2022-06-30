package com.Array;

public class EvenElement {

	public static void main(String[] args) {
		//Initialize Array
		int arr[] = {1 ,2 ,3, 4,5, 6, 7};
		// Length of the Array
		System.out.println( arr.length);
		//Element of the given Array
		System.out.println("Element of the given Array");
		//Loop through the array by incrementing value by 2
		//here i will start from the 1 as the even positioned element
		for ( int i = 1; i < arr.length; i =i+2)
		{
			System.out.println(arr[i]);
		}
		
		

	}

}