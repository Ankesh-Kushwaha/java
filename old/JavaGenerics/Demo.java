package JavaGenerics;

/*
 generics in java
  
 type safety:
   java is a typed language
   
   upcasting
      we convert a specific class in to a general class

   downcasting
       we convert a general object in to a specific class;
       it is dangerous because 

       Object obj=10;
       String s=(String) obj;
       here compiler can not decide at the run time that what is stored in the obj.here object can hold any value like Integer,boolean,string.  it will decide at the runtime that obj has a string value.this throw an error ClassCastException
*/
public class Demo {
  public static void main(String[] args) {
    //upcasting
    String s = "Hello";
    Object obj = s;
    System.out.println(obj);

    //downcasting
    Object obj2 = "Aditya";
    String s2 = (String) obj2;
    
    System.out.println(s2);

    //why downcasting is dangerous
    Object obj3 = 10;
    String s3 = (String) obj3;
    System.out.println(s3);
    
  }
}


