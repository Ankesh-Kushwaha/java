public class chainingoffunc {
  //chaining of function in java

  static void A() {
    B();

    System.out.println("function A called");
  }

  static void B() {
    C();
    System.out.println("function B called");
  }

  static void C() {
    System.out.println("last function C called");
  }
  public static void main(String[] args) {
    A();
    System.out.println("function main called");
  }
}
