package com.thread;

class ThreadWorker extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            try {
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName()+":"+i);
            } 
            catch (InterruptedException e) 
            {
                
                e.printStackTrace();
            }
        }
    }
}




public class SleepExample {

    public static void main(String[] args) {
        
        ThreadWorker t1=new ThreadWorker();
        ThreadWorker t2=new ThreadWorker();
        
        t1.start();
        t2.start();

    }

}
