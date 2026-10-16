public class function {
  //function syntax static  returntype name(args....) {return }

  static int add(int a, int b) {
    return a + b;
  }

  static int add(int a,int b, int c){
    return a+b+c;
  }

  public static void main(String[] args) {
    int ans = add(7, 8);
    int ans2 = add(8, 9, 10);
    System.out.println(ans);
    System.out.println(ans2);
  }
}
