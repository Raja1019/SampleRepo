package com.oops;

public class Circle2{

	private double radius=1.0;
    private String color="red";
	
	Circle2()
	{
		System.out.println("This is the default constructor");
	}
	
	Circle2(double radius)
	{
		this.radius=radius;
	}
	
	Circle2(double radius,String color)
	{
		this.color=color;
		this.radius=radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
     
	
	
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}
	
	public double getArea()
	{
		return Math.PI*this.radius*this.radius;
	}
	
	public double getCircumference()
	{
		return 2*Math.PI*this.radius;
	}

	public static void main(String[] args) {
		
      Circle2  c=new Circle2();
      System.out.println(c.getArea());
      System.out.println(c.getCircumference());
      System.out.println(c);
	}

}
