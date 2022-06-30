package com.oops;

import java.util.Scanner;

public class Student {
	
	//Instance Variables
	private long studentId;
	private String studentName;
	private String studentAddress;
	private long phoneNumber;
	
	
	void attendClasses()
	{
		System.out.println("This is attend class method.");
	}
	
	void exam()
	{
		
		System.out.println("This is exam method ");
	}
	
	void checkResult()
	{
		System.out.println("This is check result method");
	}
	
	
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		Student student1=new Student();
		
		System.out.println("Enter student id:");
		long studentId=scan.nextLong();
		student1.studentId=studentId;
		
		System.out.println("Enter student name:");
		String studentName=scan.next();
		student1.studentName=studentName;
		
		System.out.println("Enter student address:");
		String studentAddress=scan.next();
		student1.studentAddress=studentAddress;
		
		System.out.println("Enter student Phone number:");
		long studentPhone=scan.nextLong();
		student1.phoneNumber=studentPhone;
		
		System.out.println(student1.studentId+" "+student1.studentName+" "+student1.studentAddress+" "+student1.phoneNumber);
		
		student1.attendClasses();
		student1.exam();
		student1.checkResult();
	}

}
