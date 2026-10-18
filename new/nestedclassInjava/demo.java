

public class demo{
  public static void main(String[] args) {
    Outer.Inner inner = new Outer.Inner();
    inner.fun(); 
  }
}


class Outer{
  static int x;
   
   static class Inner{
     void fun() {
       System.out.println("fun");
      }
   }
}