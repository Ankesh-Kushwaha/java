package javaInterface;

public class Demo4 {
  public static void main(String[] args) {

  }
}

//interface inheritance
interface Animal {
  void eat();
}

interface Dog extends Animal {
  void bark();
}

class StreetDog implements Dog {
   @Override
   public void eat() {
     System.out.println("street dog eats");
   }

   @Override
   public void bark() {
     System.out.println("street dog barks");
   }
}
