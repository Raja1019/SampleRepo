package net.array;

import java.util.*;
import java.util.stream.*;
public class ReverseArray
{
 public static void main(String[] args) {
 Integer[] Array = {1,2,30,0,50,60,7,80};
 

 System.out.println("Original Array:");
 for(int i=0;i<Array.length;i++)
      System.out.print(Array[i] + "  ");
 
 System.out.println();
 
 
 System.out.println("Original Array printed in reverse order:");
      for(int i=Array.length-1;i>=0;i--)
      System.out.print(Array[i] + "  ");
 }
}