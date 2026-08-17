package collectionFramework.ListInterface;

import java.util.*;

/*
 List -> ArrayList, LinkedList, vector ,stack extends vector;

 List Interface:
    elements have a position
    duplicates are allowed
    Insertion order is preserved
    you can access element by index
    
    //sequenceCollection
      getFirst();
      getLast();
      addFirst();
      addLast();
      removeFirst();
      removeLast();

    methods 
     E get(index);
     set(index,E value);
     add(index, E value);
     boolean addAll(index,Collection<? extends E> c) 
     remove(index); remove value at that index;
     indexof(Object o);
     lastindexof(Object o);
     listIterator();//specific for only list
        remove , moveforward, movebakward , insert ,remove
    listIterator(int index);
    of() //use to make immutable list;
    copyOf() //make a copy and it is immutable
*/ 
public class Demo {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);

    System.out.println(list.get(1));
    list.set(1, 5);
    System.out.println(list);

    list.addAll(0, List.of(5, 6, 9, 8, 8));
    System.out.println(list);
    list.remove(0);
    list.indexOf(5);
    list.lastIndexOf(8);
    ListIterator<Integer> itr = list.listIterator();

    while (itr.hasNext()) {
      System.out.println(itr.next());
    }

    List<Integer> l = List.of(1, 2, 3, 4, 56, 7, 89);
    System.out.println(l);
    //throw error unsupportedOperation exception
    //l.add(10);
    List<Integer> l2 = List.copyOf(l);

  }
}


