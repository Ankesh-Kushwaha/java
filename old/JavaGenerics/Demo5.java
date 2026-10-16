package JavaGenerics;

public class Demo5 {
  public static void main(String[] args) {
    OnlyValue<Integer> ob = new OnlyValue<>(45);
    //it throw compile time error
    //OnlyValue<String> ob1 = new OnlyValue<>(null);
    System.out.println(ob.getValue());
  }
}

/*now until if we defined that T as generics then T can be anything but 
 we can limit this and extend that class to a particular class and it subType
 like ;
 we define upper bound using extends to implemet this
*/

/*now it can only takes values as number or it subtype 
but it never accepts String or any other thing outside 
number.it throw compile time error */

class OnlyValue<T extends Number> {
  private T value;

  OnlyValue(T value) {
    this.value = value;
  }

  public T getValue() {
    return this.value;
  }
}
