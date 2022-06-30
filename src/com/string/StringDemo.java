package com.string;

public class StringDemo {

    public static void main(String[] args) {
        
        StringBuilder st=new StringBuilder("Welcome to Mutable String");
        st.append(false);
        
        StringBuffer st1=new StringBuffer("Java Programming");
        
        String st2=new String("Java Programming Java");
        
        String st3="";
        System.out.println(st2.length());
        System.out.println(st2.charAt(0));
        System.out.println(st1.equals(st2));
        System.out.println(st2.contains("Java"));
        System.out.println(st2.concat(" : OOP"));
        System.out.println(st2.contentEquals(st1));
        System.out.println(st2.equalsIgnoreCase("JAVA PROGRAMMING"));
        System.out.println(st2.endsWith("Programming"));
        System.out.println(st2.startsWith("Java"));
        System.out.println(st2.indexOf('J'));
        System.out.println(st2.lastIndexOf('a'));
        System.out.println(st3.isBlank());//spaces
        System.out.println(st3.isEmpty());//length
        System.out.println(st2.trim());
        System.out.println(st2.replace("Java", "C++"));
        System.out.println(st2.replaceAll("Java", "C++"));
        System.out.println(st2.toLowerCase());
        System.out.println(st2.toUpperCase());

    }

}
