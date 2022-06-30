package com.Array;

public class ReverserElement {

	public static void main(String[] args) {
		//Array initialization
		int arr1[] = {10,11,12,13,14,15,16,17};
		
		// Length of an array
		System.out.println(arr1.length); 
		
		
		System.out.println("Element of an given Array");
		
		
		//Using for loop we will print Element of given Array
		for( int i = 0; i < arr1.length; i++)
		{
			System.out.print(arr1[i] + " ");
		}
		  System.out.println();  
	      System.out.println("Element in Reverse Order");
	      //using for loop we will print element in the Reverse order
	      for( int i = arr1.length-1; i>=0; i--)
	      {
	          System.out.print(arr1[i] + " "); 
	      }
		
		

	}

}
