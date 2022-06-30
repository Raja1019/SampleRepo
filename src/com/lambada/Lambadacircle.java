package com.lambada;


interface Circle {
 
  public   double areaofcircle(double radius);
}

class lambadaExample {
  public static void main(String[] args) {
   
    Circle c = radius -> 3.14 * radius * radius;
   

    double areaofcircle = c.areaofcircle(10);
    System.out.println("areaofcircle is: " + areaofcircle);
  }
}