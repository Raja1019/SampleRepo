package com.Linkedlist;

import java.util.Vector;

public class vectorDemo {

    public static void main(String[] args) {
        
        Vector<Integer> vector=new Vector<Integer>();
        
        vector.add(101);
        vector.add(102);
        vector.add(103);
        vector.add(104);
        vector.add(105);
        
        System.out.println(vector);
        
        for(int i=0;i<vector.size();i++)
        {
            System.out.println(vector.get(i));
        }
        
        vector.remove(0);
        vector.remove((Integer)105);
        
        System.out.println(vector.capacity());
    
        

    }

}
