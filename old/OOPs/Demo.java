package OOPs;
public class Demo {
  public static void main(String[] args) {
    Student s1 = new Student();
    Student s2 = new Student();

    s1.name = "Ankesh";
    s1.age = 20;
    s1.roll_no = 5666;
    s1.college = "Gl Bajaj";

    s2.name = "Ayush";
    s2.age = 22;
    s2.roll_no = 569;
    s2.college = "SAME";

    s1.print();
    s2.print();
   }
}

class Student {
  String name;
  int age;
  int roll_no;
  String college;

  void markAttendance() {
    System.out.println("Attendance mark by:" + name);
  }

  void print() {
    System.out.println("name:" + name + "," + "roll_no:" + roll_no + "," + "age" + age + "college:" + college);
  }
}