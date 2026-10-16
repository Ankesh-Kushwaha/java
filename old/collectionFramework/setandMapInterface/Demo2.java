package collectionFramework.setandMapInterface;
import java.util.*;
/*
  cpacity is te total storage for the internal array
  and load factor is after which extent the storage again increase and mod

  interface hiarachy
   Iterable -> collection-> set 
     set ->HashSet , LinkedHashSet
          SortedSet,Navigable Set -> TreeSet
*/

public class Demo2 {
  public static void main(String [] args) {
    // Constructore of HashSet / LinkedList  
    Set<Integer> set = new HashSet<>();
    //initial capacity
    Set<Integer> set2 = new HashSet<>(100);
    //capacity, Load Factor
    Set<Integer> set3 = new HashSet<>(100, 0.8f);

    Set<Integer> set4 = new HashSet<>(List.of(1, 2, 3, 4, 5));
    

  }
}
