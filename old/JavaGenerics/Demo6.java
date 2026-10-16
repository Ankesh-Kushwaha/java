package JavaGenerics;

public class Demo6 {
  public static void main(String[] args) {
    Box<Fish> ob = new Box<>();
    //this will throw compile time error 
    //Box<Dog> ob1 = new Box<>();
     
    Box2<Fish> ob3 = new Box2<>();
    Box2<Dog> ob4 = new Box2<>();
  }
}

//egenrics with class
class Box<T extends Animal & Swimmable> { //with this we can only able to access Fish class
  T Value;
}

class Box2<T extends Animal> {  //with this we can access both dog and Fish class
  T Value;
}

class Animal {
  void dispaly() {
    System.out.println("displaying animal");
  }
}

interface Swimmable {
  void swim();
}

class Dog extends Animal {
  @Override
  void dispaly() {
    System.out.println("Displaying dog");
  }
}

class Fish extends Animal implements Swimmable {
   @Override
   public void swim() {
     System.out.println("Fish can swim");
   }
}
