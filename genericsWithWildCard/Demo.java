package genericsWithWildCard;

public class Demo {
  public static void main(String[] args) {
    //now due to inheritance and polymorphism we can write
    Animal o = new Dog();
    //but here is a catch animal has only display option not bark;
    //but what happens if there is a list of Animal 
  }
}

class Animal {
  void display() {
    System.out.println("animal displaying");
  }
}

class Dog extends Animal {
  @Override
  void display() {
    System.out.println("dog is displaying");
  }
  
  public void bark() {
    System.out.println("dog Barks");
  }
}


