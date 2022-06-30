package com.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Resourcewithtry {

	public static void main(String[] args) {
		
	  
		try(BufferedReader br=new BufferedReader(new FileReader("C:\\\\Users\\\\RAJA\\\\Desktop\\\\testjava.txt"))) 
		{
			
			
			String line=null;
			
			while((line=br.readLine())!=null)
			{
				System.out.println(line);
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}
		
	}

}
