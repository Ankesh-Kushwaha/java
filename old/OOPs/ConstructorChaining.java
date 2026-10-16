package OOPs;

public class ConstructorChaining {
  public static void main(String [] args) {
    Student s1 = new Student();
    Student s2 = new Student("Ankesh");
    Student s3 = new Student("jhon", 45, 123, "B.tech");
    Student s4 = new Student("morris", 30);
    Student s5 = new Student("ndjndjn", 45, 456);

    s1.print();
    s2.print();
    s3.print();
    s4.print();
    s5.print();
  }
}


class Student {
  String name;
  int roll_no;
  int age;
  String course;
 

  //we can chain these constructor to one another using this keyword 
  Student() {
    //this("unknown", 0, 0, "unknown");
    this("unknown");
    System.out.println("constructor with no args called");
  }
  
  Student(String _name) {
    //this.name = _name;
    //this(_name, 0, 0, "unknown");
    this(_name, 0);
    System.out.println("constructor with one args called");
  }
  
  Student(String _name, int _age) {
    // this.name = _name;
    // this.age = _age;
    //this(_name, _age, 0, "unknown");
    this(_name, _age, 0);
    System.out.println("constructor with two args called");
  }
  
  Student(String _name, int _age,int _roll_no) {
    // this.name = _name;
    // this.age = _age;
    // this.roll_no = _roll_no;
    //this(_name, _age, _roll_no, "unknown");
    this(_name, _age, _roll_no, "unknown");
    System.out.println("constructor with three args called");
  }

  Student(String _name, int _age, int _roll_no, String _course) {
    this.name = _name;
    this.age = _age;
    this.roll_no = _roll_no;
    this.course = _course;
    System.out.println("constructor with all args called");
  }

  void print() {
    System.out.println("name: " + name);
    System.out.println("age: " + age);
    System.out.println("roll_no: " + roll_no);
    System.out.println("course: " + course);
    System.out.println();
  }
}