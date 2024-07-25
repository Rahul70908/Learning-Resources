package collectionss;
import java.util.*;
public class ComparatorString implements Comparator
{
  @Override
  public int compare(Object obj1, Object obj2) 
  {
   String s1=(String)obj1;
   String s2=obj2.toString();
//   return s1.compareTo(s2);
//  return -s1.compareTo(s2);
   return s2.compareTo(s1);
  }	
  public static void main(String[] args) 
  {
   TreeSet t=new TreeSet(new ComparatorString());
   t.add("Roja");
   t.add("ShobhaRani");
   t.add("RajaKumari");
   t.add("GangaBhavani");
   t.add("Ramalumma");
   System.out.println(t);
  }
}