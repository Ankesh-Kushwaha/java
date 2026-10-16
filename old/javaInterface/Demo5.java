package javaInterface;

/*
 after java 8
*/
public class Demo5 {
  public static void main(String[] args) {
    Vehicle v = new Car();
    v.drive();
    
    Vehicle.brake();
  }
}

/*we can not implemets a fun body in interface beacuse internally all the funs are abstract in interface

but after java 8 there are default methods which can be defined

but why these were introduced;
 List Interface ---> methods

 we can also defined static method

 from java 9
  we can introduce private access modifier in java interface
*/
interface Vehicle {
  default void drive() {
    System.out.println("vehicle is driving");
    accerelate();
  }
 
  private void accerelate() {
    System.out.println("accerelating");
  }
  
  static void brake(){
    System.out.println("Vehicle is applying break");
  }
}

class Car implements Vehicle {
  // public void drive() {
  //   System.out.println("Car is driving");
  // }
}