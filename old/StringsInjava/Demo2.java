package StringsInjava;

public class Demo2 {
  public static void main(String[] args) {
    // String s1 = "ja" + "va";
    // String s2 = "java";

   // System.out.println(s1 == s2); //true

    // String s3 = "Hello";
    // String s4 = s3 + "world";
    // String s5="Hello World";

    // System.out.println(s4 == s5); //false
    
    String s6 = "Hello";//stringPool
    String s7 = s6; //string Pool because it is assignment

   // System.out.println(s6 == s7); //true;

   String s8 = "Hello";
   s8 = "World";

   //System.out.println(s8);
   
   String s9 = new String("hello");
   String s10 = "hello";

   System.out.println(s9 == s10);
  }
}

//String pool -> "hello","Hello world"
//Heap ---> "Hello world"

