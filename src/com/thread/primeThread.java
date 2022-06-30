package com.thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PrimeWorker implements Runnable
{
    int number;
    PrimeWorker(int n)
    {
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


public class primeThread {

    public static void main(String[] args) throws NumberFormatException, IOException {
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any number:");
        int n=Integer.parseInt(br.readLine());
        PrimeWorker p=new PrimeWorker(n);
        Thread t=new Thread(p);
        t.start();
        

    }

}
