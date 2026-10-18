/*
 their is a two ways too make a class purly immutable 
 1. make the child class also immutable
 2. apply defensive copy ;
*/

public class Immutable2 {
  public static void main(String[] args) {
     College c1=new College("XYZ","mumbai");
     Student s1 = new Student(18, "jhon", c1);

     System.out.println(s1.getCollege().name);
     //now you can not change it because College is also mutable;
     s1.getCollege().name = "WXY";
     System.out.println(s1.getCollege().name);
  }
}

final class Student {
  final private String name;
  final private int age;
  final private College college;

  Student(int age, String name, College college) {
    this.age = age;
    this.name = name;
    this.college = new College(college.name, college.address);
  }

  public int getAge() {
    return this.age;
  }

  public String getName() {
    return this.name;
  }

  public College getCollege() {
    return new College(this.college.name, this.college.address);
  }
}

//method 2 defensive copy
class College {
   public String name;
   public String address;

  College(String name, String address) {
    this.name = name;
    this.address = address;
  }

  public String getName() {
    return this.name;
  }

  public String getAddress() {
    return this.address;
  }
}


//make this class immutable also
// final class College {
//   final public String name;
//   final public String address;

//   College(String name, String address) {
//     this.name = name;
//     this.address = address;
//   }

//   public String getName() {
//     return this.name;
//   }

//   public String getAddress() {
//     return this.address;
//   }
// }