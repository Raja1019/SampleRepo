package com.Project;

import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int MailboxCapacity = 1250;
	private int defaultpasswordLength = 8;
	private String companySuffix = "Edubridgecompany.com" ;
	private String email;
	private String AlternateEmail;
	private String changePassword;
	
	//constructor to get 1st and lastname
	
	public Email(String firstName , String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("Email Created: " + this.firstName + " " + this.lastName);
		
		// calling a method asking for department 
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
		
		this.password = randomPassword(defaultpasswordLength );
		System.out.println("Your Password is: "  + this.password);
		
		email = firstName.toLowerCase() + lastName.toLowerCase() + "@" + department + "." + "companySuffix";
		System.out.println("Your Email is: " + email);
		}
	
	
	//Ask for the department
	private String setDepartment() {
		System.out.print("DEPARTMENT CODES:-\n1 For Sales\n2 For Development\n3 For Accounting\n0 For none\nENTER DEPARTMENT:-");
		Scanner in = new Scanner(System.in);
		int departmentChoice = in.nextInt();
		if(departmentChoice == 1 ) 
		{return "sales"; }
		else if (departmentChoice == 2)
		{return "development"; }
		else if (departmentChoice == 3)
		{ return  "accounting"; }
		else {return " invalid input from user ";}
		
		
	}
		
	//Generating Random  password
	
	private String randomPassword(int length)
	 	{ 		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%"; 		
	char[] password = new char[length]; 		
	for(int i = 0; i<length; i++) { 			
		int rand = (int) (Math.random() * passwordSet.length()); 			
	password[i] = passwordSet.charAt(rand);  			 } 		
	return new String(password); 		 	
		
	}
	
	// Set mailbox capacity
	public void  setMailboxCapacity(int capacity)
	{
		this.MailboxCapacity = capacity;
	}
	
	// Set Alternate Email
	public void  setAlternateEmail(String alternateEmail)
	{
		this.AlternateEmail = alternateEmail;
	}
	
	//Change password
	public void  changePassword(String changePassword)
	{
		this.changePassword = changePassword;
	}
	
	public int getmailboxCapacity() 
	{
		return MailboxCapacity; 
		}
	public String getalternateEmail() 
	{
		return AlternateEmail;
	}
	public String getPassword() 
	{
		return password;
	}
	
	public String showinfo()
	{
		return "DISPLAY NAME:" + firstName + " " + lastName + 
				"\nCOMPANY EMAIL:" + email + 
				"\nMAILBOX CAPACITY: " + MailboxCapacity + "mb";
	}
	
	
	public static void main(String[] args) {
		

	}

}
