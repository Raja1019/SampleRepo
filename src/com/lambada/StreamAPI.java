package com.lambada;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class StreamAPI {

    public static void main(String[] args) {
        
        ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(12,67,1,4,67,9,55,77,15));
        ArrayList<Integer> result=new ArrayList<Integer>();
        ArrayList<Float> floatlist =new ArrayList<Float>(Arrays.asList(12.4F,5.8F,9.7F));
       
        

        
        result=(ArrayList<Integer>) list.stream().map(a->a*a).collect(Collectors.toList());
        System.out.println(list); 
        System.out.println(result); 
        
        ArrayList<Integer> sortedlist=(ArrayList<Integer>) list.stream().map(x->x).sorted().collect(Collectors.toList());
		System.out.println(sortedlist);
	    sortedlist=(ArrayList<Integer>) list.stream().map(x->x).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortedlist);


    }

}
