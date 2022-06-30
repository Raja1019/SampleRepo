package com.demo;

class Encapsulation
{
	private String name;
	private int roll;
	private int age;
	
	
	public Encapsulation(String name, int roll, int age) {
		super();
		this.name = name;
		this.roll = roll;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	
	
	public void setAge(int age) {
		this.age = age;
	}
		
}



 public class TestEncapsulation {

	public static void main(String[] args) {
		Encapsulation e=new Encapsulation("virat" , 55 , 32);
		
		e.setAge(29);
		
		System.out.println(e.getName()+" "+e.getRoll()+" ");
		
		System.out.println(e.getRoll());
		
		
	}

}
