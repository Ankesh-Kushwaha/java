public class Abstraction {
  public static void main(String[] args) {
    Animal a1 = new Dog();
    a1.makeSound();
    a1.breathe();
  }
}

abstract class Animal {
  //give abstarct method 
  abstract void makeSound();
  
  void breathe() {
     System.out.println("Animal is breathing");
  }
}

class Dog extends Animal {
  @Override 
  void makeSound() {
    System.out.println("Dog is barking");
  }
}