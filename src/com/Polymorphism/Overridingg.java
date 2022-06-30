package com.Polymorphism;
class Parent
{
	public void test() //Overriden method
	{
		
		System.out.println("This is parent's test method");
	}
	
	
}

class Child extends Parent
{
	public void test()  //Overriding method
	{		
		System.out.println("This is Child's test method");
	}		
}


public class Overridingg {
	public static void main(String[] args) {
		Parent p1=new Parent();
		p1.test();
		
		
		Parent p=new Child(); //Runtime Polymorphism
		p.test();

	}

}
