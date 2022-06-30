package com.string;

public class UpperAndLower {

	public static void main(String[] args) {
		String str = "My Name Is Raja Kumar And Yours";
		int upper = 0, lower = 0;
		for(int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			if(ch>= 'A' && ch <= 'Z')
				upper++;
			else if (ch >= 'a' && ch <= 'z')
                lower++;
			
		}

        System.out.println("Lower case letters : " + lower);
        System.out.println("Upper case letters : " + upper);
	}

}
