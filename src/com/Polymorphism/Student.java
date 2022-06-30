package com.Polymorphism;

public class Student {

	private String name;
	private long age;
	private String address;
	
	Student()
	{
		this.name="Unknown";
		this.age=0;
		this.address="Not available";
		
	}
	
	public void setInfo(String name,long age)
	{
		this.name=name;
		this.age=age;
	}
	public void setInfo(String name,long age,String address)
	{
		this.name=name;
		this.age=age;
		this.address=address;
	}
	
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	public static void main(String args[])
	{
		Student s1=new Student();
		System.out.println(s1);
		
		Student s2=new Student();
		s2.setInfo("Raman", 23);
		System.out.println(s2);
		
		Student s3=new Student();
		s3.setInfo("Suman", 21,"Mumbai");
		System.out.println(s3);
	}
	
}
