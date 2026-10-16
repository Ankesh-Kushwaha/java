package collectionFramework.collectionInterface;
import java.util.*;
/*
 Collection as interface 
 Collections as utility class
 Basic operation functions
   size();
   isEmpty();
   contains();
   Iterator<E> iterator();
   Object[] toArray();
   <T> T[] toArray(T[],a);
   boolean add(E e);
   boolean remove(Object o);
   boolean containsAll(Collection<?> c);
   boolean addAll(Collection<? extends E> c);
   boolean removeAll(Collection<?> c);
   boolean retainAll(Collection<?> c);
   void clear();
   boolean equals(Object o);
   int hashCode();

   modern java
   default boolean removeIf(Predicate < ? super E> filter);
   default Spliterator<E> spliterator();
   default Stream<E> stream();
   default Stream<E> parallelStream();

*/

public class collectionI {
  public static void main(String[] args) {
    Collection<Integer> c = new HashSet<>();
    c.add(1);
    c.add(2);
    c.add(3);

    int n = c.size();
    System.out.println(n);
    System.out.println(c.isEmpty());

    //boolean contains
    System.out.println(c.contains(8));

    //iterator 
    Iterator<Integer> it = c.iterator();

    //Object toArray();
    Object[] obj = c.toArray();

    for (Object o : obj) {
      System.out.println(o);
    }

    //T[] toArray(T[] a)  it takes a array types and return the same type array after conversion
    
    Integer[] arr = c.toArray(new Integer[0]);
    for (Integer i : arr) {
      System.out.println(i);
    }

    //boolean add(E e);
    boolean b = c.add(3);
    System.out.println(b);
    
    //boolean remove(Object obj);
    System.out.println(c.remove(5));
   
    //boolean addAll(Collection<? extends E> c);
    c.addAll(List.of(5, 6, 7, 8, 9));
    System.out.println(c);

    //conatains all
    //boolean containsAll(Collection<?> c);
    System.out.println(c.containsAll(List.of(1, 2, 3)));

    //boolean removeAll(collection<?> c);
      c.removeAll(List.of(1, 2));
      System.out.println(c);
    //boolean retainAll()-->intersection;
    c.retainAll(List.of(1, 2, 3));
    System.out.println(c);

    //clear();
    c.clear();
    System.out.println(c);

    //equals() ,hashCode();
    
  }
}
