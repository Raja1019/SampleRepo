package com.oops;


class Shape
{
	void toPrintShape()
	{
		System.out.println("this is shape");
	}
}


class Rectangle extends Shape
{
	void toPrintRec()
	{
		System.out.println("this is rectangular shape");
	}
}
class Circle3  extends Shape
{
	void toPrintCircle3()
	{
		System.out.println("this is circular shape");
	}
}
class Square extends Rectangle
{
	void toPrintSquare()
	{
		System.out.println("Square of Rectangle");
	}	
}


public class Test1 {
	

	public static void main(String[] args) {
		Square sq=new Square();
		sq.toPrintShape();
		sq.toPrintRec();
		
		
		
	}

}
