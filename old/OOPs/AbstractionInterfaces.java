package OOPs;

public class AbstractionInterfaces {
  public static void main(String[] args) {
    Car c1 = new ElectricCar();
    Car c2 = new DieselCar();

    c1.start();
    c1.acceralate();
    c1.brake();

    c2.start();
    c2.acceralate();
    c2.brake();
  }
}


interface Car {
 void start();

  void brake();

  void acceralate();
}


class ElectricCar implements Car {
  @Override
  public void start() {
    System.out.println("electric car is starting");
  }
   
  @Override
  public void acceralate() {
    System.out.println("electric car is accerelating");
  }

  @Override
  public void brake() {
    System.out.println("electric car is stoping");
  }
}

class DieselCar implements Car {
  @Override
  public void start() {
    System.out.println("diesel car is starting");
  }

  @Override
  public void acceralate() {
    System.out.println("diesel car is accerelating");
  }
  
  @Override
  public void brake() {
    System.out.println("diesel car is stoping");
  }
}
