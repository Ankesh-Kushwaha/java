package OOPs;

/*
  high level abastraction(separate what from how);
  this can be done by two ways abstract class and interfaces
  absract methos can never be private;

  Abstract classes
  1. Cannot be instantiated directly
  2. Can contain abstract method (method without implementations)
  3. Can also contain normal methods.
  4. Is meant to be extended.

  . Questions:
  1. Can abstract classes have constructors?  --> Yes
  2. Can abstract classes be final ? --> No
  3. Can abstract class have static methods/variables ? --> Yes
  4. Can abstract classes private methods ? --> yes but non abstract
  5. Can abstract classes have final methods ? --> yes but non abstract
  6. Can abstract classes have no abstract method ? --> Yes
*/
public class HighLevelAbstaraction {
  public static void main(String[] args) {
    Car c1 = new ElectricCar();
    Car c2 = new DieselCar();

    c1.start();
    c1.accerelate();
    c1.brake();

    c2.start();
    c2.accerelate();
    c2.brake();
  }

}

abstract class Car {
  abstract void start();
  abstract void accerelate();
  abstract void brake();
}

class ElectricCar extends Car {
  void start() {
    System.out.println("electric car is starting");
  }
   
  void accerelate() {
    System.out.println("electric car is accerelating");
  }

  void brake() {
    System.out.println("electric car is stoping");
  }
}

class DieselCar extends Car {
  void start() {
    System.out.println("Diesel car is starting");
  }

  void accerelate() {
    System.out.println("Diesel car is accerelating");
  }

  void brake() {
    System.out.println("Diesel car is stopping");
  }
}