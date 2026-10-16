package JavaGenerics;

/*
Generics 
   limitations of using Object as UNiversal Type
    1.Type information get lost;
    2.wrong object could be inserted
    3.Casting became necessary when reading
    4.Many errors shift to runtime

  what is generics
    
*/
public class Demo3 {
  public static void main(String[] args) {
    //type argument.right side is optinal to write Integer
    Box<Integer> b1 = new Box<Integer>(10);
    Box<String> b2 = new Box<>("ankesh");
    Box<Boolean> b3 = new Box<Boolean>(true);

    //now we can easily perform any operation
    //and casting is not allowed in siblings it gives compile time error; 
  }
}


class Box <T> {//type parameter
  private T value;

  Box(T value) {
    this.value = value;
  }
  
  public T getValue() {
    return this.value;
  }

  public void setValue(T value) {
    this.value = value;
  }
}
