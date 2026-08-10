package OOPs;
/*
   types of inheritance
   1.simple inheritance
   2.multi-level inheritance
   3.hierarchial inheritance
   4. multiple inheritance not supported in java


   Super keyword
   1. to access parent class variable
   2. to call parent class constructor and assign values;
   3. we can call parent class method using super 
*/

public class Inheritance {
  public static void main(String[] args) {
    EngineeringStudent s1 = new EngineeringStudent();
    MedicalStudent s2 = new MedicalStudent();

    s1.attendLab();
    s2.attendlab(); 
  }
}

//simple inheritance
class Student { //parent
  String name;
  int age;

  public void markAttendance() {
    System.out.println("Attendance marked");
  }
}

class EngineeringStudent extends Student { //child
  void attendLab() {
    System.out.println("ENgineering student lab attended");
  }
}

//multilevel inheritance
class CSEengineeringStudent extends EngineeringStudent {
  void attendCSElab() {
    System.out.println("CSE lab Attended");
  }
}


/*
 hierrachy
        A
        /\
        B C
 */

class MedicalStudent extends  Student{
  void attendlab() {
    System.out.println("medical student attended lab");
  }
}



