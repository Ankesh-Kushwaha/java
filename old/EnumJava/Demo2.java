package EnumJava;

/*
 Enum ---> Enumerations (Enumerated type)
 Enum --> Predefined set of constants.

  understanding of enum
   
  enum Direction{
   NORTH,
   SOUTH,
   EAST,
   WEST
  }

  enum is internally act as a class compiler convert it in java internally;
  java.Enum override;

  class Direction extends Enum<Direction>{
    each constants are static and final they are actually objects of class direction
    public static final Direction NORTH=new Direction();
    public static final Direction SOUTH=new Direction();
    public static final Direction EAST=new Direction();
    public static final Direction WEST=new Direction();

    //private constructor
    private constructor(){
    
    }
  }

  Enum-> class
    states 
    behaviour

   enum Direction{ //now we want to store degress also
    NORTH,
    SOUTH,
    EAST,
    WEST

    
   }
*/

public class Demo2 {
  public static void main(String[] args) {
    //int status = PaymentStatus2.SUCCESS;

    PaymentStatus status = PaymentStatus.SUCCESS;
    System.out.println(status.name());
  }
}

enum PaymentStatus {
  SUCCESS,
  FAILED,
  PENDING
}

class PaymentStatus2 {
  public static final int SUCCESS = 1;
  public static final int FAILED = 2;
  public static final int PENDING = 3;
}