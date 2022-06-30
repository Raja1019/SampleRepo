package com.demo;

class X
{
    
    int a=50;//Data member
    X()
    {
        System.out.println("This is parent class constructor");
    }
    public void test()
    {
        System.out.println("This is test method");
    }
    
    
}

class Y extends X
{
    Y()
    {
        super();
        System.out.println(super.a);
        super.test();
    }
    
    
}



public class Supertest {

    public static void main(String[] args) {
        Y ob=new Y();
        

    }

}
