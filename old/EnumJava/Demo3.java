package EnumJava;

/*
 enum Direction extends Enum(java.lang);
  important methods
   values();--> compiler generates itself
   valueof(String); --> compiler generate itself
   name(); --> comes from Enum class
   ordinal();--> comes from ordinal class
   
   values => return array of all the values;

   valueOf()=> Convert a String into an enum Constant.it is case sensitive; give illegalArgument exception

   name()=> return the exact name of a enum Object;
   
   ordinal()=> return the index of each enum constant;
   toString(),equals(),hashCode(); we can override them here as well 
*/


public class Demo3 {
  public static void main(String[] args) {
    Direction d = Direction.SOUTH;

    System.out.println(d.getDegree());
    d.move();

    Direction[] directions = Direction.values();

    for (Direction direction : directions) {
      System.out.println(direction.name());
    }

    Direction d2 = Direction.valueOf("EAST");

  }
}

//implementation using anonymous class
enum Direction {
  NORTH(0){
    @Override
    public void move(){
      System.out.println("Move up (y+1)");
    }
  },
      
  SOUTH(180){
    @Override
    public void move() {
      System.out.println("MOve down (Y-1)");
    }
  },
  EAST(90) {
     @Override
    public void move() {
      System.out.println("Move right (x+1)");
     }
  },
  WEST(270){
    @Override
    public void move() {
      System.out.println("Move left (X-1)");
    }
  };

  private int degree;

  Direction(int degree) {
    this.degree = degree;
  }

  public int getDegree() {
    return this.degree;
  }

  public abstract void move();
}



//how this enums looks at backend
/* 
final class Direction2 extends Enum<Direction>{
   public static final Direction NORTH=new Direction(0);
   public static final Direction SOUTH=new Direction(180);
   public static final Direction EAST= new Direction(90);
   public static final Direction WEST=new Direction(270);

   private int degree;

   private Direction(int degree){
    this.degree=degree;
   }

   public int getDegree(){
   return this.degree;
   }
}
*/