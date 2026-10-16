package OOPs;

/*
Super keyword
   1. to access parent class variable
   2. to call parent class constructor and assign values;
   3. we can call parent class method using super
*/
public class SuperKeyword {
  public static void main(String[] args) {
    EngineeringStudent student = new EngineeringStudent("Alice", 101, 20, "ABC College");
    System.out.println(student.name + " - " + student.roll_no + " - " + student.age + " - " + student.college);
  }
}

class Student {
  String name;
  int roll_no;
  int age;

  public Student(String _name, int _roll_no, int _age) {
    this.name = _name;
    this.roll_no = _roll_no;
    this.age = _age;
  }
}

class EngineeringStudent extends Student {
  String college;

  public EngineeringStudent(String name, int roll_no, int age, String college) {
    super(name, roll_no, age);
    this.college = college;
  }
}