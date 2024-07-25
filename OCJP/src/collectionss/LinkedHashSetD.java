package collectionss;
import java.io.Serializable;
import java.util.*;
public class LinkedHashSetD
{
  public static void main(String[] args) 
  {
   	LinkedHashSet h=new LinkedHashSet();
   	h.add("B");
   	h.add("C");
   	h.add("D");
   	h.add("Z");
   	h.add(null);
   	h.add(10);
   	System.out.println(h.add("D"));
   	System.out.println(h+"\n");

   	System.out.println(h instanceof Serializable);
    System.out.println(h instanceof Cloneable);
    System.out.println(h instanceof RandomAccess);
  }
}