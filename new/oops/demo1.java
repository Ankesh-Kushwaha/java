//package   new.oops;

/*
  rules for constructor
   1. same name as class
   2.no return type
   3.automatically called suring object creation
   4.used to initialize object
   5. it can be overloaded
*/
public class demo1 {
   public static void main(String [] args){
     Student s1=new Student("Ankesh",24,52,"xyz");

     System.out.println(s1.name);
     System.out.println(s1.age);
     System.out.println(s1.roll_no);
     System.out.println(s1.college);
   }
}


class Student{
   String name;
   int age;
   int roll_no;
   String college;

   public Student(String name, int age, int roll_no, String college) {
     this.name = name;
     this.age = age;
     this.roll_no = roll_no;
     this.college = college;
   }
  
   public Student() {

   }
  
   public Student(String name,int age,int roll_no) {
     this.name = name;
     this.age = age;
     this.roll_no = roll_no;
   }
}