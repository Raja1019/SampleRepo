package com.thread;
class ShutdownHook extends Thread
{
    public void run()
    {
        
        System.out.println("Here goes the clean up code...");
    }
}




 class TestRuntimeHook {

    public static void main(String[] args) {
        
    	ShutdownHook s=new ShutdownHook();
        Runtime.getRuntime().addShutdownHook(s);
        
        //Runtime.getRuntime().removeShutdownHook(s);

    }

}
