package com.thread;

class Table
{
	    synchronized static void multiplicationTable(int number)
		{ 
				for(int i=1;i<=10;i++)
				{
					System.out.println(number*i);
					try
					{
						Thread.sleep(1000);
					}
					catch(InterruptedException e)
					{
						System.out.println(e);
					}
				}
		 
		}
}

class Task1 extends Thread
{
 	public void run()
 	{
 		Table.multiplicationTable(7);
 	}
}

class Task2 extends Thread
{
	public void run()
 	{
 		Table.multiplicationTable(17);
 	}
}		
		
		
public class DemoSynchronization {

	public static void main(String[] args) {
		
		Task1 t1=new Task1();
		Task2 t2=new Task2();
		
		t1.start();
		t2.start();

	}

}
