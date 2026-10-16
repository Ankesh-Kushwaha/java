package nestedClass;

/*
  reason for nesting classes
  1. logical grouping
  2. Better access to outer class

*/
public class Demo {
  public static void main(String[] args) {
    Outer outer = new Outer();
    Outer.Inner inner = new Outer.Inner();
    inner.fun();
  }
}

//static nested class
class Outer {
  static class Inner {
    void fun() {
      System.out.println("hello");
    }
  }
   
}