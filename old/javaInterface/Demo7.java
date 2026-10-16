package javaInterface;

/*
 java resolution ploicy
 here java always priotries class instead of interface
*/
public class Demo7 {
  public static void main(String[] args) {
    C c = new C();
    c.fun();
  }
}

interface A {
  void fun();
}

class B {
  void fun() {
    System.out.println("Hi from class B");
  }
}

class C extends B implements A {
  @Override
  public void fun() {

  }
}

/*
interface vs abstract class

interface 
  contract
  roles 
  functionalities
   ex like runnable , walkable, payable
  (can-do relationship);

abstract
  Families of a similar class 
    Dog , Duck ,elephant
    
    Animal
      Dog , Duck , elephant
  (is-a) relationship;
  

interfaces
   no normal fields
   contructor are not available
   multiple inheritance supported
   methods only public , private after java 9

abstract
  we can define normal fields
  constructor are available;
  multiple inheritance can not be supported
  all access modifiers are allowed

functional Interfaces -> unlocks functional programming
   they contain only one methods
    interface A{
     void fun();
    }
  
  class B implements A{
  
  }

marker Interfaces
  interfaces with no methods
  interface A{
    
  }
  
  interface Clonable , Serializable ,RandomAccess;

internal working of interface

interface Animal{
    void run();
}

java treats it as class;
*/