package com.Project;

public class EmailApp {

	public static void main(String[] args) {
	

		Email em1 = new Email("Raja" , "kumar");
		System.out.println(em1.showinfo());
		
		em1.setAlternateEmail("rajachaurasia6658@gmail.com");
		System.out.println( "AlternateEmail:-" + em1.getalternateEmail());
		
		
		
	}
	}


