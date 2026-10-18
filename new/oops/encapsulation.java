public class encapsulation{
   public static void main(String[] args) {
      Animal a1 = new Animal();
      a1.SetName("DOg");
      System.out.print(a1.getName());
   }
}

class Animal {
   String name;
   String type;

   public String getName() {
      return this.name;
   }
   
   public void SetName(String name) {
      this.name = name; 
   }
}