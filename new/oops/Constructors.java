
public class Constructors {
  public static void main(String[] args) {
    // Student s1 = new Student();
    // Student s2 = new Student("Ankesh", "XYZ");
    // Student s3 = new Student(s2);

    // System.out.println("Oject 2" + s2.name + " ," + s2.college);
    // System.out.println("Oject 3" + s3.name + " ," + s3.college);    
    // System.out.println(s2 == s3);

    Student2 s1 = new Student2("Ankesh");
    
  }
}

/*
 constructor must have same name as class
 constructor does not have any return values
 constructor can not be abstract, static ,final or synchronised

 types of constructor 
  default , parameterised , copy constructor
*/
class Student {
  //default
  String name;
  String college;

  Student() {
    System.out.println("Student class initalised ");
  }

  //parameterised constructor
  Student(String name,String college) {
    this.name = name;
    this.college = college;
  }

  //copy Constructor => use to initialise a values using an object
  Student(Student s) {
    this.name = s.name;
    this.college = s.college;
  }
}


// constructor overloading and chaining in java
class Student2 {
  String name;
  String college;
  int roll_no;
  int mobile;

  Student2() {
    this("unknown");
    System.out.println("first construtor call");
  }
  
  Student2(String name) {
    this(name, "unknown");
    System.out.println("second construtor call");
  }

  Student2(String name, String College) {
    this(name, College, 0);
    System.out.println("third construtor call");
  }
  
  Student2(String name, String College, int roll_no) {
    this(name, College, roll_no, 0);
    System.out.println("fourth constructor called");
  }
  
  Student2(String name, String college, int roll_no, int mobile) {
    this.name = name;
    this.college = college;
    this.roll_no = roll_no;
    this.mobile = mobile;
    System.out.println("fifth constructor called");
  }
}