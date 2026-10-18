public class Inheritance {
  public static void main(String[] args) {
    ElectricCar c1 = new ElectricCar();
    c1.start();
    c1.Charging();
    c1.Stop();
  }
}


class Car {
  public void start() {
    System.out.println("car is starting");
  }
  
  public void Stop() {
    System.out.println("car is stoping");
  }
}

class ElectricCar extends Car {
  void Charging() {
    System.out.println("Electric car is charging");
  }
}

class DieselCar extends Car {
  void getFul() {
    System.out.println("diesel car get fuel");
   }
}




