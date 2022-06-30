package com.Bank.managment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BankingApp {

	ArrayList<UserAccount> users=new ArrayList<UserAccount>();
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	static UserAccount user=null;
	
	public BankingApp()
	{
		users.add(new UserAccount(1816,9876545,"Raja Chaurasia",155000,"Hajipur",9876564,"r1816"));
	}
	
	
	synchronized public boolean login() throws NumberFormatException, IOException
	{
		
		System.out.println("Enter UserID:");
		long userId=Integer.parseInt(br.readLine());
		System.out.println("Enter Password:");
		String password=br.readLine();
		int flag=0;
		for(UserAccount u:users)
		{
			if(u.getUserId()==userId &&   u.getPassword().equals(password))
			{   
				flag=1;
				user=u;
			}
		}
		if(flag==0)
			return false;
		else
			return true;
	}
	
	synchronized public boolean transferFund() throws NumberFormatException, IOException
	{
		System.out.println("====================================================================");
		System.out.println("Enter Receiver Account No. :");
		long rAccount=Long.parseLong(br.readLine());
		System.out.println("Enter Amount:");
		double amount=Double.parseDouble(br.readLine());
		if(user.getUserBalance()>amount)
		{	
			user.setUserBalance(user.getUserBalance()-amount);
			return true;
		}
		else
			return false;
	}
	
	synchronized public void showDetail()
	{
		System.out.println("====================================================================");
		System.out.println("Account Details :");
		System.out.println(user.toString());
		
	}
	
	synchronized public void updateDetail() throws NumberFormatException, IOException
	{
		String c = null;
		int flag = 0;
		do {
		System.out.println("====================================================================");
		System.out.println("What you want to upadte:");
		System.out.println("  1)Name \n  2)Address\n  3)Contact Number \n  4)Password\n  5)Exit");
		System.out.println("Enter your choice:");
		int UpdateChoice=Integer.parseInt(br.readLine());
		String s;
		switch (UpdateChoice) {
			case 1:
					System.out.println("Enter name to update:");
					s=br.readLine();
					user.setUserName(s);
					flag=1;
					break;
			case 2:
					System.out.println("Enter address to update:");
					s=br.readLine();
					user.setUserAddress(s);
					flag=1;
					break;
			case 3:
					System.out.println("Enter Contact Number to update:");
					s=br.readLine();
					user.setContactNumber(Long.parseLong(s));
					flag=1;
					break;
			case 4:
					System.out.println("Enter Password to update:");
					s=br.readLine();
					user.setPassword(s);
					flag=1;
					break;
			case 5:
					c="n";
					break;
			default:
					throw new IllegalArgumentException("Unexpected value: " + UpdateChoice);
		}
		if(UpdateChoice!=5)
		{	
		System.out.println("Do you want to update anything else?(Y->Yes / N->No)");
		c=br.readLine();
		}
		}while(c.equals("Y")|| c.equals("y"));
		if(flag==1)
		{
		System.out.println("====================================================================");
		System.out.println("Details Updated Successfully...!");
		}	
	}
	
	synchronized public void withdraw() throws NumberFormatException, IOException {  
        double amt; 
        System.out.println("====================================================================");
        System.out.println("Account Balance :"+user.getUserBalance());
        System.out.println("Enter the amount you want to withdraw: ");  
        amt = Double.parseDouble(br.readLine());
        if(user.getUserBalance()>amt)
        	user.setUserBalance(user.getUserBalance()-amt); 
        else
        	System.out.println("Unsufficient Balance..!");
        checkBalance();
    }
	synchronized public void deposit() throws NumberFormatException, IOException {  
        double amt; 
        System.out.println("====================================================================");
        System.out.println("Enter the amount you want to deposit: ");  
        amt = Double.parseDouble(br.readLine()); 
        user.setUserBalance(user.getUserBalance()+amt); 
        checkBalance();
    }
	synchronized public void checkBalance()
	{
		System.out.println("====================================================================");
		System.out.println("Current Available Balance :"+user.getUserBalance());
		

	}
	
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
	
		System.out.println("\n====================================================================");
		System.out.println("----------------------- Bank Application ---------------------------");
		System.out.println("====================================================================");
		
		
		if(new BankingApp().login())
		{
			System.out.println("====================================================================");
			System.out.println("                     Welcome Back.....!\n");
			String c=null;
			do
			{
				System.out.println("\n====================================================================");
				System.out.println("Dashbord:");
				System.out.println("\t\t 1)Fund Transfer.\r\n"
						+ "\t\t 2)Show Account Details.\r\n"
						+ "\t\t 3)Update account Details.\r\n"
						+ "\t\t 4)Withdraw Amount.\r\n"
						+ "\t\t 5)Deposit Amount.\r\n"
						+ "\t\t 6)Check Balance.\r\n"
						+ "\t\t 7)Exit.");
				System.out.println("====================================================================");
				System.out.println("Enter your choice:");
				int choice=Integer.parseInt(br.readLine());
				
				switch(choice)
				{
					case 1: 
						    if(new BankingApp().transferFund())
						    {
						    	System.out.println("Successfully transfer funds.");
						    	new BankingApp().checkBalance();
						    }
						    else
						    {	
						    	System.out.println("failed..!:insufficient balance");
						      	new BankingApp().checkBalance();
						    }
						    break;
					case 2:
							new BankingApp().showDetail();
							break;
					case 3:
							new BankingApp().updateDetail();
							break;
					case 4:
							new BankingApp().withdraw();
							break;
					case 5:
							new BankingApp().deposit();
							break;
					case 6:	
							new BankingApp().checkBalance();
							break;
					case 7:
						 	c="n";
							break;
				    default:System.out.println("Wrong choice!!"); 		   
				
				}
				if(choice!=7)
				{
				System.out.println("====================================================================");	
				System.out.println("Do you want to continue?(Y->Yes / N->No)");
				c=br.readLine();
				}
			}while(c.equals("Y")|| c.equals("y"));
				
			System.out.println("====================================================================");
			System.out.println("Bye...");
			System.out.println("====================================================================");
		}			  
		else
		{
			System.out.println("User not authenticated!!");
		}
	}
}