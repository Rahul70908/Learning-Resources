package collectionss;
import java.io.Serializable;
import java.util.*;
public class LinkedListDemo 
{
  public static void main(String[] args) 
  {
    LinkedList l=new LinkedList();
    l.add("durga");
    l.add(30);
    l.add(null);
    l.add("durga");
    System.out.println(l);

    l.set(0,"Software");
    System.out.println(l);
    
    l.add(0,"venky");
    System.out.println(l);
    
    l.removeLast();
    System.out.println(l);
    
    l.addFirst("CCC");
    System.out.println(l+"\n");
    
    System.out.println(l instanceof Serializable);
    System.out.println(l instanceof Cloneable);
    System.out.println(l instanceof RandomAccess);
  }
}