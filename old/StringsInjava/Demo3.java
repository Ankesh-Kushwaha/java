package StringsInjava;

/*
 problem of immutability
 StringBuilder and StringBuffer

 String class conceptual overview
   public final class String {
     private final byte[] values;
     private final byte coder;
       string in ASCII values coder=0;
        takes 1 byte for representation
      string other than ASCII value UTF16 coder=1;
        takes 2 byte for representation

     private int hash;
   }
*/
public class Demo3 {
  public static void main(String[] args) {
    String s = "";

    for (int i = 0; i < 5; i++) {
      s += i;
      System.out.println(s);
    }
  }
}

