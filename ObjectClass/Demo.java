package ObjectClass;

import java.util.Objects;

/*
   contains in java.lang
   parent of all the classes in java
   every class in java inherit from Object class

   commom behaviour(inheritance);
   due to polymorphism we can point our object class refrence to any class Object o=new myClass

   Core methods
   toString();
   equals();
   hashCode();
   getClass();

   CLoning
   Clone();

   Garbage collection
   finalize();

   Threads
   wait();
   notify();
   notifyAll();

   toString()=> convert anything in String
   class Object{
     public String toString(){
      //return string representation of Objects
    }
   }
    
   we can override this toString function as our requirement;
   class Student extends Object{
    @override
    toString(){
    
    }
   }
    
   default to string prints a hexadecimal values

   //equals => compares two object and return true and false;

   class Object{
    public boolean equals(Object obj){
      //default implementation compares two references
    }
   }

   class Student{
    String name;
    int age;
   }

  Student  s1=new Student("Ankesh",23);
  Student s2=new Student("Ankesh",23);

  s1.equals(s2); return false;

  3.hashCode
   return an Integer of an Object in hexadecimal format
    if we have a string we want to hash it in a number than we can do that by this. this return a unique representation of each object

   signature 
   class Object{
   public int hashCode(){
    //default;
   }
   }
   
   important rule => if two object are equal then there hashes must be equal;
   Student s1=new Student("ankesh",23);
   Student s2=new Student("ankesh",23);
   s1.equals(s2);
   s1.hashCode()==s2.hashCode();

   but reverse might not be true;

   getClass()=> return runtime class of an object;
    Student s1=new Student();
    s1.getClass()=> return Class.getName type object 

    signature
    class Object{
      public final Class<?> getClass(){
       //default we can never override it as it is final;
      }
    }
      
  Clone()=> 
    create a copy of an Object
    
    class Object{
     protected Object Clone() throws classNotSupportedException{
      //default;
     }
    }

   if class Student implements Clonable then only we can overide Clone();
  

*/
public class Demo {
  public static void main(String[] args) throws CloneNotSupportedException {
    Student s1 = new Student();
    s1.name = "Ankesh";
    s1.age = 23;

    System.out.println(s1);

    Student s2 = new Student();
    s2.name = "Ankesh";
    s2.age = 23;

    Student s3 =(Student) s1.clone();
    // System.out.println(s1.equals(s2));

    // System.out.println(s1.hashCode() == s2.hashCode());
  }
}

//instanceOf operator-> check if an object is instance of a class or any of its subClass;

class Student implements Cloneable {
  String name;
  int age;

  @Override
  public String toString() {
    return (name + "," + age);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;

    //check the type of class
    if (obj.getClass() != this.getClass()) {
      return false; //check if both the classes are of same class;
    }

    Student s = (Student) obj;
    return this.name == s.name && this.age == s.age;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age);
    // int result = 17;
    // result = result * 31 + age;
    // result = result * 31 + (name == null ? 0 : name.hashCode());
    // return result;
  }

  @Override 
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}
