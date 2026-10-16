package EnumJava;

/*
 payment status ----> success , failed , pending
 final 

 problems with this approach
  1. Type Safety;
  2. Poor readiability
  3. No grouping of realated enttities;
*/
public class Demo {
  public static void main(String[] args) {
    int status = PaymentStatus.SUCCESS;

    System.out.println(status);
  }
}

class PaymentStatus {
  public static final int SUCCESS = 1;
  public static final int FAILED = 2;
  public static final int PENDING = 3;
}

class Role {
  public static final int admin = 1;
  public static final int user = 2;
  public static final int manager = 2; //we can easily duplicate value;
}