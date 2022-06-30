package com.oops;

public class Counter {
		//non-static variable
		private int c=0;
		
		//static variable
		static int x=0;
		
		
		Counter()
		{
			c=c+1;
			x=x+1;
		}

		public static void main(String[] args) {
			
			
			Counter c1 = new Counter();
			Counter c2 = new Counter();
			Counter c3 = new Counter();
			
			System.out.println(c3.c);
			System.out.println(Counter.x);
	}

}
