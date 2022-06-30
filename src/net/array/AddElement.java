package net.array;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {

	
		 public static void main(String[] args)
		    {
		        Scanner sc=new Scanner(System.in);
		        
		        int n;    //Array Size Declaration
		        System.out.println("Enter the number of elements :");
		        n=sc.nextInt();    
		        
		        int arr[]=new int[n];    
		        System.out.println("Enter the elements of the array :");
		        for(int i=0;i<n;i++)    
		        {
		            arr[i]=sc.nextInt();
		        }
		        System.out.println("Enter the elements you want to insert :");
		        int ele = sc.nextInt(); 
		     
		      
		        System.out.println("Enter the position where you want to insert :");
		        int pos = sc.nextInt(); 
		      
		        arr = addElement(n, arr, ele, pos); 
		  
		        
		        System.out.println("Array with " + ele  + " inserted at position " + pos + ":" + Arrays.toString(arr)); 
		        
		    }

		private static int[] addElement(int n, int[] arr, int ele, int pos) {
			
			return null;
		}

	

	

		
		}
		

	


