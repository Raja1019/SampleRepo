package com.thread;
class TaskWork extends Thread
{
    private long sleep;
    private int sum;
    
    public TaskWork(long sleep)
    {
        this.sleep=sleep;
    }
    
    
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(Thread.currentThread().getName()+":"+i);
            sum=sum+i;
             
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
        }
        
    }
    
    public int getSum()
    {
        return this.sum;
    }
}


public class JoinExample {

    public static void main(String[] args) {
        TaskWork t1=new TaskWork(1000);
        TaskWork t2=new TaskWork(2000);
        TaskWork t3=new TaskWork(2000);
        
        t1.start();
        
        
        
        try {
            t1.join();
        } catch (InterruptedException e) {
        
            e.printStackTrace();
        }
        
        t2.start();
        
        try {
            t2.join();
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        }
        t3.start();
        
             
        

    }

}
