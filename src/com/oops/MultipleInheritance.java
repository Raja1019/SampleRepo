package com.oops;

interface One
{
	public void oneTest();
}


interface Two
{
	public void twoTest();
	
}


interface Three extends One,Two
{
	public void threeTest();
}


class threeImplementation implements Three
{

	@Override
	public void oneTest() {
		
		System.out.println("This is one test method ");
		
	}

	@Override
	public void twoTest() {
	
		System.out.println("This is two test method ");
	}

	@Override
	public void threeTest() {
		
		System.out.println("This is three test method ");
		
	}
	
}



public class MultipleInheritance {

	public static void main(String[] args) {
		Three ob=new threeImplementation();
		ob.oneTest();
		ob.twoTest();
		ob.threeTest();

	}

}
