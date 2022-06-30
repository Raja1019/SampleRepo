package com.Polymorphism;

public class MainOverloading {

	public static void main(String[] args) {
		System.out.println("This is main method");
		main("Java Programming");

	}
	
	public static void main(String args)
	{
		System.out.println("This is main method with string object as an argument");
		main("Java","Developers");
	}
	
	
	public static void main(String args1,String args2)
	{
		System.out.println("This is main method with string two objects arguments");
	}

}
