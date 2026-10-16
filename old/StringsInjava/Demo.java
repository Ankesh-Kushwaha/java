package StringsInjava;

/*
  comes under java.lang.String
  String is a immutable class 

  StringPool 
    java reserves some memory in a heap area and keep the same refrence for the same string. instead of creating 
    again a new object for a string. because we use millions of strings in our daily operations. it keeps string fast and optimised.

  string can be declared in two ways
   litral and second using new keyword

   golden rule:
    only compile time constants go to StringPool automatically
    runtime created String go to heap memory
    
*/

public class Demo {
  public static void main(String[] args) {
    String s = "Hello";
    String s2 = "Hello";
    s.concat("world");
    System.out.println(s == s2);
    
    String s3 = new String("world");
    String s4 = new String("world");

    System.out.println(s3 == s4);
  }  
}
