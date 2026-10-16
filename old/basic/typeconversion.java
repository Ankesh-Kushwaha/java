public class typeconversion {
  // type conversion in java
  // implicit and explicit
  // conversion done by the compiler itself then it is called implicit conversion
  // conversion done by explicitly by programmer is called explicit conversion
  // we can do explicit conversion using casting

  //automatic type promotion
  /*byte a =50
    byte b=40;
    byte c=100
   
    if a*b is greater than the range of the byte then 
    compiler automatically promote the type;
    int i=(a*b)/c;
  
    Rules:
     1. byte , short and char values get promoted to int
     2.if one operand is long then whole expression became long
     3. if one operand is float, entire expression will become float
     4 if one expression is double then whole expression become double;
  */
  public static void main(String[] args) {
    int i = 128;
    byte b = (byte) i;

    System.out.printf("%d", b);
  }
}
