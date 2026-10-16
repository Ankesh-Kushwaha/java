package OOPs;

/*
 Student s1=new Student();
 stack store the refrence(left side) and real allocation at heap(right side);

 references= 4 byte;
 objects size
  string name= 4 byte
  int age=4 byte
  int roll_no= 4 byte
  string college = 4byte
   then total size allocation is 16 byte(4+4+4+4); no it is not true

   Object size consist of
    header size 
    exact fields
    padding

    object header => holds metadata of objects => mark words,syncronization, garbage collection
    it all takes 8 byte
    class pointer = 4 byte or 8 byte

    exact data= 16 byte

    padding => optional=> we always consider data store in java in 8byte of chunks. so object must store in multiple of 8. so to it happens we add some padding

    12+16=28 + 4(padding)= 32;
*/
public class Object {
  
}
