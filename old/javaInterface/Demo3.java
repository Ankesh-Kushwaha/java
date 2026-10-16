package javaInterface;

/*
 Multiple inheritance in java;
*/
public class Demo3 {
  public static void main(String[] args) {
    C a = new C();
    a.hello();
    a.greet();
  }
}

//gives error but we can implement same using interfaces

// class A {
// };

// class B {

// };

// class C extends A, B{

// }

interface A {
  void hello();
}

interface B {
  void greet();
}

class C implements A, B {
   @Override
   public void hello() {
       System.out.println("says Hello");
   }
   
   @Override 
   public void greet() {
     System.out.println("says morning");
   }
}