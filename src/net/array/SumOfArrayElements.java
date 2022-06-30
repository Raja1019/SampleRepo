package net.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfArrayElements {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
		
		System.out.println("Enter the size of the array:");
		int size=Integer.parseInt(br.readLine());
		
		int ar[]=new int[size];
		int sum=0;
        for(int i=0;i<ar.length;i++)
        {
        	System.out.println("Enter the element at "+i+"index:");
        	ar[i]=Integer.parseInt(br.readLine());
        	
        }
        
        for(int i=0;i<ar.length;i++)
        {
        	sum=sum+ar[i];
        }
        
        System.out.println("Sum="+sum);
        
        
	}

}
