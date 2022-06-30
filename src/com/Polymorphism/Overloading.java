package com.Polymorphism;

public class Overloading {

	
	public int sum(int a,int b)
	{
		return (a+b);
	}
	
	public int sum(int a,int b,int c)
	{
		return (a+b+c);
	}
	
	public double sum(double a,double b)
	{
		return (a+b);
	}
	
	
	
	public static void main(String[] args) {
		
		Overloading ob=new Overloading();
		System.out.println(ob.sum(12, 45));
		System.out.println(ob.sum(23, 56, 90));
		System.out.println(ob.sum(12.3, 56.7));
	

	}

}
