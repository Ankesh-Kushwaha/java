package takingInput;
import java.io.IOException;

public class Demo1 {
  public static void main(String[] args) throws IOException {
    // int x = System.in.read();

    // System.out.println((char)x);

    int ch = System.in.read();
    while (ch != '\n') {
      ch = System.in.read();
      System.out.print((char) ch);
    }

  }
}

/*
  it only takes input in a integer. if we paas a char the it convert into the ASCII value 
  and then convert it into the binary and read 1 byte of data at a time 
  like if we give input as A it print 65 and if we give input as Ankesh then also it gives 65
  because it only read one byte of data.
*/
