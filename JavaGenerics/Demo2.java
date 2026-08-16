package JavaGenerics;

/*
 Generics
  
  what is problem before generics

*/
public class Demo2 {
  public static void main(String[] args) {
    Box b1 = new Box(10);
    Box b2 = new Box("ankesh");
    Box b3 = new Box(true);
   
    //we can not perform this operation because compiler cannot decide which value it holds.
    //b2.getValue()+5;

    //we want to perform then we have to downcast it;
    //but this is risky at the production;
    Integer x = (Integer) b1.getValue();
    System.out.println(x + 5);
    String y = (String) b2.getValue();
    System.out.println(y + 9);
  }
}

/*
   this is a box class holds a value val;
   but what happens if we need to hold a string value yhen we have to make an another class....now if we want to hold a another value then we have to make another class;
   
class Box {
  private int value;

  Box(int value) {
    this.value = value;
  }

  public int getValue() {
    return this.value;
  }

  public void setValue(int Value){
    this.value = Value;
  }
}
*/

class Box {
  private Object value;
 
  Box(Object value) {
    this.value = value;
  }
 
  public Object getValue(){
    return this.value;
  }

  public void setValue(Object val) {
    this.value = val;
  }
}