package javaInterface;

/*
 interfaces in java are defined as they tell that what an object does without telling how they do
 interfaces are blueprint for behaviour;

 polymorphism 

*/

public class Demo {
  public static void main(String[] args) {
    // Car c = new Thar();
    // c.drive();

    Payment p = new DebitCard();
    p.pay();

    Payment p2=new CreditCard();
    p2.pay();
  }
}

// interface Car {
//   void drive();
// }

// class Thar implements Car {

//    @Override
//    public void drive() {
//      System.out.println("thar is driving");
//   }
// }

interface Payment {
  void pay();
}

class CreditCard implements Payment {
  @Override
   public void pay() {
     System.out.println("pay by credit card");
   }
}

class DebitCard implements Payment {
   @Override
  public void pay() {
    System.out.println("Pay by debit card");
  }
}