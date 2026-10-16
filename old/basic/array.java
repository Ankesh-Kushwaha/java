public class array{
  public static void main(String[] args) {
    //array declaration syntax in java
    int[] arr = new int[10];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = i;
    }

    // for (int i = 0; i < arr.length; i++) {
    //   System.out.print(arr[i]);
    //   System.out.print(" ");
    // }

    //multidimensional array
    int[][][] arr2 = new int[10][10][10];

    int num = 0;
    for (int i = 0; i < arr2.length; i++) {
      for (int j = 0; j < arr2[0].length; j++) {
        for (int k = 0; k < arr2[0][0].length; k++) {
          arr2[i][j][k] = num;
          num++;
        }
       }
    }

    for (int i = 0; i < arr2.length; i++) {
      for (int j = 0; j < arr2[0].length; j++) {
        for (int k = 0; k < arr2[0][0].length; k++) {
          System.out.print(arr2[i][j][k] + " ");
        }
        System.out.println();
      }
      System.out.println();
    }
    
    //strings in java
    //primitive  byte , long , int ,short , char ,boolean 
    //non - primitive -> array,string,class;

    String firstname = "Ankesh";
    String lastname = "Kushwaha";
    System.out.print(firstname + lastname);
  }
}