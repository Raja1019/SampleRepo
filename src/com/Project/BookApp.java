package com.Project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookApp {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static Connection conn=new DBconnection().DBconnect();
	
	public void addBook() throws NumberFormatException, IOException, SQLException
	{
		System.out.println("Enter book Id :");
		int BOOK_ID= Integer.parseInt(br.readLine());

		System.out.println("Enter book Name :");
		String BOOK_NAME=(br.readLine());

		System.out.println("Enter book Author name :");
		String AUTHOR_NAME= (br.readLine());

		System.out.println("Enter book discription :");
		String BOOK_DISCRIPTION=(br.readLine());

		System.out.println("Enter book price:");
		double BOOK_PRICE= Double.parseDouble(br.readLine());

		System.out.println("Enter isbn number :");
		long ISBN_NUMBER= Long.parseLong(br.readLine());
		
		PreparedStatement stmt = conn.prepareStatement("insert into book value(?,?,?,?,?,?)");
		stmt.setInt(1, BOOK_ID);
		stmt.setString(2, BOOK_NAME);
		stmt.setString(3, AUTHOR_NAME);
		stmt.setString(4, BOOK_DISCRIPTION);
		stmt.setDouble(5, BOOK_PRICE);
		stmt.setLong(6, ISBN_NUMBER);
		

		if(stmt.executeUpdate()>0)
		{
			System.out.println("Book information added!!");
		}
		else
		{
			System.out.println("Somthing went wrong!!");
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}

	
		{
			System.out.println("Enter book Id:");
			int bookid=Integer.parseInt(br.readLine());
			
			PreparedStatement ps=conn.prepareStatement("delete from book where bookId=?");
			ps.setInt(1, bookid);
			if(ps.executeUpdate()>0)
			{
				System.out.println("Record deleted!!");
			}
			else
			{
				System.out.println("Problem in delete operation!!");
			}	
			
		}

		
		
	
	public static void main(String[] args) {
		
		
		

	}

}
