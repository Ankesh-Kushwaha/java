package collectionFramework.iterableInterface;
import java.util.*;

/*
 iterables in java 
  there are two data structure in java iterable and non-iterable;
   iterable can eaisly traveresed  using loop
   but in case of uniterable we have can not use loops because they are not continuous they are store at different memory locations;

    objects -> iterbale -> collection -> list, queue,set.

*/


public class iterbale {
  public static void main(String[] args) {
    Collection<Integer> list = new HashSet<>();

    for (int i = 0; i < 10; i++) {
      list.add(i);
    }

    Iterator<Integer> itr = list.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }

  }
}
