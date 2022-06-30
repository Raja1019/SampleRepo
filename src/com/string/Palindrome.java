package com.string;

public class Palindrome {

	public static void main(String[] args) {
		String str = "madam";
		StringBuffer buffer = new StringBuffer(str);
		buffer.reverse();
		String data = buffer.toString();
		if(str.contentEquals (data)) {
			System.out.println("Given String is Palindrome");
			
		}
		else {
			System.out.println("Given String is not  Palindrome");
			
		}
	}

}
