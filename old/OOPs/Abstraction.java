package OOPs;

/*
 the process of focusing on what something does , while ignoring how it does

 represent whatever necessary
 even what we model we do not want everyone to know how everything works , but they can still use it.

 1.low level abstraction(hiding implementation detail)
 2.high level abstraction(separate what from how);
*/

//low-level abstarction
public class Abstraction {
  public static void main(String[] args) {
    Car c = new Car();
   
    //main class does not need to know how these are implemented
    c.start();
    c.acceralate();
    c.brake();
   }
}

class Car {
  String type;


  public void start() {

  }
  
  public void acceralate() {

  }
  
  public void brake() {
    
  }
}

