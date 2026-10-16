package functionalInterface;

public class Demo {
  public static void main(String[] args) {
    Calculator c = new Addition();
    print(8,9,c);
  }

  public static void print(int a,int b , Calculator c){
    System.out.println(c.calculate(8,9));
  }
}


@FunctionalInterface 
interface Calculator {
  int calculate(int a, int b);
}

//traditional method
class Addition implements Calculator {
   @Override 
  public int calculate(int a, int b) {
     return a + b;
   }
}
