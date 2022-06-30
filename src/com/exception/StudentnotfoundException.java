package com.exception;

public class StudentnotfoundException {

    public void checkId(int id) throws ClassNotFoundException
    {
        if(id<1 || id>1000)
        {
            throw new ClassNotFoundException("Student Id does not exist!!");
        }
    }
    
    public static void main(String[] args) {
        
        
        try
        {
            new StudentnotfoundException().checkId(-8);
            
        }
        catch(ClassNotFoundException e )
        {
            System.out.println(e.getMessage());
        }
    }

}