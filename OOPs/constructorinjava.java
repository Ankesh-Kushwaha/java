package OOPs;

public class constructorinjava {
  public static void main(String[] args) {
    Student s1 = new Student("Ajay", 22, 2301920100052L, "Gl Bajaj");
    
    s1.markAttendance();
  }
}

/*
  Default value;
  local variable have no default value;
 integer=0
 floating = 0.0;
 Boolean=false;
 String => null
*/

class Student {
  //instance variable
  String name;
  int age;
  long roll_no;
  String college;

  /* contructor  
  1. same name as class
  2.no return type even not void
  3.automatically called during object creation
  4.used to initialize an object
  5. can be overloaded as it is a function
  */

  Student(String _name, int _age, long _roll_no, String _college) {
    this.name = _name;
    this.age = _age;
    this.roll_no = _roll_no;
    this.college = _college;
  }

  //instance methods
  void markAttendance() {
    System.out.println("attendance mark by student: " + name);
  }
}


