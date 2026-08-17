package JavaGenerics;

public class Demo4 {
  public static void main(String[] args) {
    Pair<Integer, String> ob1 = new Pair<>(45, "Ankesh");
    System.out.println(ob1.getT());
    System.out.println(ob1.getU());
  }
}

//what happens if we try to form a universal class for different data types

class Pair<T, U> {
  private T value1;
  private U value2;

  Pair(T value1, U value2) {
    this.value1 = value1;
    this.value2 = value2;
  }

  //function with generics
  public T getT() {
    return this.value1;
  }

  public U getU() {
    return this.value2;
  }

}
