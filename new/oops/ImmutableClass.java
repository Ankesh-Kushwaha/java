/*
   a object is called immutable if we can not change its values and methods then it is called immutable object

   rules of immutable object
   1. marks my class as final 
   2. marks my variables as private and final
   3. no setters , so we can not set the value ever
   4. 
 */

public class ImmutableClass {
  public static void main(String[] args) {
     College c1 = new College("xyz", "Bombay");
     Student s1 = new Student(17, "Ankit", c1);
     
     //here it breaks the immutablity we are able to change the college name so that it is not purely immutable
     System.out.println(s1.getCollege().name);
     s1.getCollege().name = "VXY";
     System.out.println(s1.getCollege().name);
   }
}

final class Student {
  private final int age;
  private final String name;
  private final College college;

  Student(int age, String name, College college) {
    this.age = age;
    this.name = name;
    this.college = college;
  }

  public int getAge() {
    return this.age;
  }

  public String getName() {
    return this.name;
  }

  public College getCollege() {
    return this.college;
  }
}


class College {
  String name;
  String Address;
  
  College(String name, String address) {
    this.name = name;
    this.Address = address;
  }
  
  String getCollegeName() {
    return this.name;
  }
  
  String getCollegeAddress() {
    return this.Address;
  }
}

//we can not do this because student is immutable
// class CSEStudent extends Student {
  
// }