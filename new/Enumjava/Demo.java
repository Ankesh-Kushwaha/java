/*
 Enum ---> enumeration 
 enum is a predefined set of constants

*/
public class Demo {
  public static void main(String[] args) {
   // paymentStatus status = paymentStatus.SUCCESS;
    //gives compile time error;
    //paymentStatus status2 ="ERROR"

    Direction2 d = Direction2.SOUTH;
    System.out.println(d.getDegree());
  }
}

enum paymentStatus {
  SUCCESS,
  FAILED,
  PENDING
}

class paymentStatus2 {
  public static final String SUCCESS = "success";
  public static final String FAILED = "failed";
  public static final String PENDING = "pending";
}

//understanding enum
enum Direction {
  NORTH,
  SOUTH,
  EAST,
  WEST
}

//instead of only direction we also wnat to store degree
enum Direction2 {
  NORTH(0),
  SOUTH(180),
  EAST(90),
  WEST(270);

  public int degree;

  Direction2(int degree) {
    this.degree = degree;
  }

  public int getDegree() {
    return this.degree;
  }
}

//internal implementation 
// final class Direction2 extends Enum<Direction> {
//   public static final Direction2 NORTH = new Direction2();
//   public static final Direction2 SOUTH = new Direction2();
//   public static final Direction2 EAST = new Direction2();
//   public static final Direction2 WEST = new Direction2();

//   private Direction2(){
//   }
// }

/*
enum internally act as a  class so we can do everything 
that we can do in class like values and methods,
*/