package com.Linkedlist;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedlistDemo {

    public static void main(String[] args) {
        
        LinkedList<String> list=new LinkedList<String>();
        
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("E");
        list.add(null);
        
        System.out.println(list);
        
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }

        
        for(String s:list)
        {
            System.out.println(s);
        }
        
        
        Iterator<String> itr=list.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        
        list.addAll(Arrays.asList("F","G","H"));
        System.out.println(list);
        
        list.addFirst("First");
        list.addLast("last");
        
        System.out.println(list);
        
        
        //list.clear();//removes all the elements
        List<String> copylist=new LinkedList<String>(list);
        //copylist=(List<String>) list.clone();
        
        
        System.out.println(copylist);
        
        
        System.out.println(list.contains("G"));
        
        
        
        Iterator<String> itr1=list.descendingIterator();
        while(itr1.hasNext())
        {
            System.out.print(itr1.next()+" ");
        }
        
        System.out.println();
        System.out.println(list.element());
    }

}
