package collectionss;
import java.util.*;
public class CursorsDemo 
{
 public static void main(String[] args) 
 {
  Vector v=new Vector();
  
  Enumeration e=v.elements();
  
  Iterator i=v.iterator();
  
  ListIterator ltr=v.listIterator();
  
  System.out.println(e.getClass().getName());
  System.out.println(i.getClass().getName());
  System.out.println(ltr.getClass().getName());
  }
}