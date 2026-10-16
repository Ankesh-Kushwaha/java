package Revision;

/*there is two type of typecasting in java 
  1.widening typecating in this we typecaste a smaller data type to its bigger data type
   byte-> short -> char -> int -> long -> float -> double (it is done automatically because we can assign a smaller container to a larger conatiner);
  2. Narrowing casting in this we typecast a bigger data type to its smaller size 
  double -> float -> long -> int -> char -> short -> byte
  Narrowing casting must be done manually by placing the type in parentheses () in front of the value.
*/
public class typeCasting {
  public static void main(String[] args) {
    //widening type casting
    short v = 123;
    int b = v;
    System.out.print(b);

    //narrowing type casting
    long a = 90909090;
    int c = (int) a;
    System.out.print(c);
   }  
}
