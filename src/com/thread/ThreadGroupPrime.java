package com.thread;

import java.util.Scanner;

class ThreadPrime extends Thread
{
    int number;
    public ThreadPrime(String name,ThreadGroup group,int n)
    {
        super(group, name);
        this.number=n;
        
    }
    
    public void run()
    {
        int c=0;
        for(int i=1;i<=this.number;i++)
        {
            if(this.number%i==0)
            {
                c=c+1;
            }
        }
        
        if(c==2)
        {
            System.out.println("Prime number");
        }
        else
        {
            System.out.println("Non-prime number");
        }
    }
    
}

class ThreadOddEven extends Thread
{

    int number;
    public ThreadOddEven(String name,ThreadGroup group,int n)
    {
        super(group, name);
        this.number=n;
        
    }
    
    public void run()
    {
        if(this.number%2==0)
        {
            System.out.println("Even number");
        }
        else
        {
            System.out.println("Odd number");
        }
    }
    
}
public class ThreadGroupPrime {

    public static void main(String[] args) {
        
        ThreadGroup group=new ThreadGroup("Task1");
        Scanner scan=new Scanner(System.in); 
        System.out.println("Enter a  number:");
        int n=scan.nextInt();
    
        ThreadPrime t1=new ThreadPrime("Prime", group, n);
        t1.start();
        
        ThreadOddEven t2=new ThreadOddEven("OddEven", group, n);
        t2.start();
    }

}
