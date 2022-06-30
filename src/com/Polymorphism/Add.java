package com.Polymorphism;
class Addition
{
	public int add(int a,int b,int c)
	{
		int sum=a+b+c;
		return sum;
		
	}
	
	
	public double add(double a,double b,double c)
	{
		
		double sum=a+b+c;
		return sum;
	}
	
	
	
	
}



public class Add {
	public static void main(String args[])
	{
	Addition ob=new Addition();
	System.out.println(ob.add(12.8, 97.4, 28.7));
	
	System.out.println(ob.add(12, 97, 28));

}
}

