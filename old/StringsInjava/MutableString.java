package StringsInjava;

/*
the problem with immutability is that they consume a lot of memory space because for every call they creates a new objects which result in a cause of lot of memory wastage.

this is done solved by java using two classes StringBuilder and StringBuffer they make string mutable.

class StringBuilder extends AbstractStringBuilder{
 byte[] values ;coder
 int count; no of spaces used in array
 int capacity; capacity of the array ones the capacity is going to full java double the capacity value;
  2*capacity + 2;
}

class StringBuffer extends AbstractStringBuilder{
   
}
 
constructors 
  s=new StringBuilder();
  
  s=new StringBuilder(50); give the capacity initially;

  s=new StringBuilder("java"); pass string initially;

  important methods 
    append();
    insert();
    delete();
    replace();
    reverse();
    charAt();
    setCharAt();
    length();
    capacity();
    ensureCapacity();
    trimTosize();

    stringBuffer is use for mutability and thread safe;
*/

public class MutableString {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();

    sb.append("ankesh");
    sb.append("kushwaha");

    sb.insert(2, 'K');
    
    sb.delete(0, 2);
    sb.deleteCharAt(1);
    sb.replace(1, 3, "hii");
    sb.reverse();
    sb.charAt(5);
    sb.setCharAt(4, 'Z');
    sb.length();
    sb.capacity();//give the isze of internal buffer array;
    sb.ensureCapacity(0100); //give the size of capcity initially at starting
    sb.trimToSize();//remove unuse memory;
    System.out.println(sb);
  }
}
