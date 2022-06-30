package net.array;

import java.util.Arrays;

public class Bubblesort {

    public static void main(String[] args) {
        
        int ar[]= {12,67,9,90,65,56,7,5};
        
        System.out.println(Arrays.toString(ar));
        
        int length=ar.length;
        
        for(int i=0;i<length-1;i++)//pass
        {
            for(int j=0;j<length-1-i;j++)
            {
                if(ar[j]>ar[j+1]) //67>9
                {
                    int temp=ar[j]; //temp=67
                    ar[j]=ar[j+1];  //ar[j]=9
                    ar[j+1]=temp;   //ar[j+1]=67
                }
            }
        }
        
        System.out.println(Arrays.toString(ar));

    }

}
