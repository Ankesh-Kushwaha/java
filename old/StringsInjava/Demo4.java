package StringsInjava;

/*
   constructors in String class
   new String();
   new String(string);
   new String(char[]);
   new String(byte[]);
   new String(StringBuilder);
   new String(StringBuffer);

   string methods
   length/emptiness
      length();
      isEmpty();
      isBlank();

   character Access
      CharAt();
      toCharArray();
   
   comparision
     equals();
     
     equalsIgnoreCase();
     compareTo();
   
   Searching
    contains();
    indexOf();
    lastIndexOf();
    startWith();
    endsWith();

  Extraction/Transformation
    subString();
    toUpperCase();
    toLowerCase();
    trim();
    strip();
    repeat();
    replace();
    replaceAll();
    split();
    join();
  
  Conversion
    valueOf();
    getBytes();
  
  Advance
   intern();
   format();
*/

public class Demo4 {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Hello");
    String s8 = new String(sb);

    System.out.println(s8);

    String s1 = new String("ankesh");

    System.out.println(s1.length());
    System.out.println(s1.isEmpty());
    System.out.println(s1.isBlank());

    //character access;
    System.out.println(s1.charAt(5));
    char[] arr = s1.toCharArray();
    String s2 = new String("ankesh");
    //comparision
    System.out.println(s1.equals(s2)); //string class override it

    System.out.println(s1.equalsIgnoreCase(s2));
    //lexicographical comparision
    //s1>s2 +ve
    //s1<s2 -ve
    //s1==s2 0;
    System.out.println(s1.compareTo(s2));
     
    //Searching

    System.out.println(s1.contains("an"));
    System.out.println(s1.indexOf('a'));
    
  }
}