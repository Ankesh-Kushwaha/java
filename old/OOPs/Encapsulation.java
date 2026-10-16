package OOPs;
/*
 binding the data and behaviour together is called encapsulation
 
 1.both data and behaviour encapsulated within the object
 2.we should not provide unrestricted access of data;

 access modifiers
 1. public :-> anyone can access
 2. default :-> anyone can access belonging to same package
 3. private :-> only can be accessed inside the class
 4. protected :-> only can be accssed in inherited class

 a class can not be private and protected;
 getter and setter
  
 inbuilt-package
 java.util
 java.lang
 java.io;
*/

class Encapsulation{
  public static void main(String [] args) {
    BankAccount acc1 = new BankAccount("SBI", 456123789L, 0.0, "SBI45666");
    
    System.out.println(acc1.getBalance());
  }
}

class BankAccount {
  private String Bank_name;
  private long Account_number;
  private double Balance;
  private String IFSC_code;

  BankAccount(String _bank_name) {
    this(_bank_name, 0, 0.0, "unknown");
  }

  BankAccount(String _bank_name, long _Account_number) {
    this(_bank_name, _Account_number, 0.0, "unknown");
  }
  
  BankAccount(String _bank_name, long _Account_number,double _amount) {
    this(_bank_name, _Account_number, _amount, "unknown");
  }


  BankAccount(String _bank_name, long _Account_number, double _Balance, String _IFSC_code) {
    this.Bank_name = _bank_name;
    this.Account_number = _Account_number;
    this.Balance = _Balance;
    this.IFSC_code = _IFSC_code;
  }

  public void deposit(double val) {
    this.Balance += val;
    System.out.println("amount deposited successfully");
  }

  public void withdraw(double val) {
    if (Balance < val) {
      System.out.println("Balance is unsufficient");
      return;
    }

    Balance = Math.max(0, Balance - val);
    System.out.println("withdraw successfuly");
  }

  public double getBalance() {
    return this.Balance;
  }

  public void setBalance(double _amount) {
    this.Balance = _amount;
  }
}