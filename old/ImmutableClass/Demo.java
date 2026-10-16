package ImmutableClass;

/*
 a object which variable and methods can not be changed once declared is called immutable class

 rules for immutable object
  mark the class as final;
  mark instance veriable as private and final;
  no setters

 why this happens
   due to shollow copy
*/

public class Demo {
  public static void main(String[] args) {
    College college = new College("XYZ", "assam");
    Student s1 = new Student(23, "Ankesh",college);

    System.out.println(s1.getCollege().name);

    //but what if if can change the name of the college
    college.name = "WXY";
    //it print WXY which is wrong because here we can change a value of the object 
    System.out.println(s1.getCollege().name); //WXY
  }
}

//not pure immutable;
final class Student {
  private final int age;
  private final String name;
  private final College college;

  Student(int age, String name,College college) {
    this.age = age;
    this.name = name;
    this.college = college;
  }

  //getters
  public int getAge() {
    return this.age;
  }

  public String getName() {
    return this.name;
  }

  public College getCollege() {
    return college;
  }
}

//mutable
class College {
  String name;
  String Address;
    
  College(String name, String address) {
    this.name = name;
    this.Address = address;
  }
}

