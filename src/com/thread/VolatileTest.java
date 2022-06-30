package com.thread;
class MyThread1 extends Thread
{
    VolatileTest t;
    MyThread1(VolatileTest t)
    {
        this.t=t;
    }
    
    public void run()
    {
        
        for(int i=1;i<=100;i++)
        {
            t.increment();
        }
        t.display();
    }
    
}

class MyThread2 extends Thread
{
    VolatileTest t;
    MyThread2(VolatileTest t)
    {
        this.t=t;
    }
    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            t.increment();
        }
        t.display();
    }
    
}


public class VolatileTest {

      volatile int a,b;
    
     void increment()
    {
        b=b+1;
        a=a+1;
        
    }
    
     void display()
    {
        System.out.println(Thread.currentThread().getName()+"a:"+a);
        System.out.println(Thread.currentThread().getName()+"b:"+b);
        
    }
    
    public static void main(String[] args) {
        VolatileTest t=new VolatileTest();
        
        t.display();
        
        MyThread1 t1=new MyThread1(t);
        MyThread2 t2=new MyThread2(t);
        
        

        t1.start();
        
        try {
            t1.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        t2.start();
        
        
        t.display();
        
    }

}
