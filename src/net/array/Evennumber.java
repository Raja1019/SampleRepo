package net.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class  Evennumber {

    public static void main(String[] args) throws NumberFormatException, IOException {
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
        
        System.out.println("Enter the size of the array:");
        int size=Integer.parseInt(br.readLine());
        
        int ar[]=new int[size];
        int sum=0, i;
        for(int i1=0;i1<ar.length;i1++)
        {
            System.out.println("Enter the element at "+i1+"index:");
            ar[i1]=Integer.parseInt(br.readLine());}
            
            System.out.print("even numbers");
            for(int i1 = 0; i1<ar.length; i1++ )
            {
            	if(ar[i1] % 2 == 0)
            	{
            		System.out.println(ar[i1] + " ");
            	}
            }
            
        }
}

    

        
        