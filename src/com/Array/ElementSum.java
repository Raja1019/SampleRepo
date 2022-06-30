package com.Array;

public class ElementSum {

	public static void main(String[] args) {
		int arr[] = {50 , 55 , 60 , 65 , 70 , 75};
		int sum = 0;
		for(int i = 0; i < arr.length; i++)
		{
			sum = sum + arr[i];
		}
		 System.out.println("Sum of all the elements of an array: " + sum);  
	}

} 
