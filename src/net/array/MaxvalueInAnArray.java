package net.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxvalueInAnArray {

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
        
        //[12,89,34,44,6,93]
        int max=ar[0],min=ar[0];  //max=12 89>12 max=89
        for(int i=1;i<ar.length;i++)
        {
            if(ar[i]>max)
            {
                max=ar[i];
            }
            if(ar[i]<min)
            {
                min=ar[i];
            }
        }
        
        System.out.println("Maximum value="+max);
        System.out.println("Minumum value="+min);

    }

}