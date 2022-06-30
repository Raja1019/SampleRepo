package com.Array;

public class CopyArray {

	public static void main(String[] args) {
		// Initialize array
		int[] arr1 = new int[] {1,8,2,6,5};
		//Crate another Array arr2 with size of arr1
		int[] arr2 = new int[arr1.length];
		//Copying all element of one array to another
		for( int i= 0; i < arr1.length; i++)
		{
			arr2[i] = arr1[i];
			
		}
		//Displaying elements of an array arr1
		System.out.println("Element of an array");
		for( int i= 0; i < arr1.length; i++)
		{
			System.out.println(arr1[i] + " ");
		}
		//System.out.println();
		 //Displaying elements of array arr2
		System.out.println("Element of new Array:");
		for(int i = 0; i < arr2.length; i++)
		{
			System.out.println(arr2[i] + " ");
		}
	}

}
