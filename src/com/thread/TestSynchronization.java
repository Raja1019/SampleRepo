package com.thread;

class SharedResource extends Thread
{
	  void multiplicationTable(int number)
	{  //Synchronization block
	  synchronized (this) {
		
	
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
	}


class Thread1 extends Thread
{
	SharedResource r;
	Thread1(SharedResource r)
	{
		this.r=r;
	}

	public void run()
	{
		r.multiplicationTable(5);
	}
}

class Thread2 extends Thread
{
	SharedResource r;
	Thread2(SharedResource r)
	{
		this.r=r;
	}

	public void run()
	{
		r.multiplicationTable(15);
	}
}
public class TestSynchronization {

	public static void main(String[] args) {
		
		SharedResource s=new SharedResource();
		
		Thread3 t1=new Thread3(s);
		Thread2 t2=new Thread2(s);
		
		t1.start();
		t2.start();
	}

}
