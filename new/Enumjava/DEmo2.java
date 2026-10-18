
/*
  enum important methods 
  compiler generated method:
    values 
    valuesof(String)
  Enum Class Method:
    name();
    ordinal();
*/
public class DEmo2 {
  public static void main(String[] args) {
    Direction d = Direction.EAST;
    d.move();
  }
}


enum Direction {
  NORTH {
    @Override
    public void move(){
      System.out.println("moving up (Y+1)");
    }
  },
  SOUTH {
    @Override 
    public void move() {
      System.out.println("moving down (Y-1)");
    }
  },
  EAST {
    @Override 
    public void move() {
      System.out.println("moving right (x+1)");
    }
  },
  WEST {
    @Override 
    public void move() {
      System.out.println("moving left (X-1");
    }
  };
      
  public abstract void move();
}
