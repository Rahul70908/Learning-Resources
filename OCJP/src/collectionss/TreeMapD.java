package collectionss;
import java.util.*;
class mycomparator1 implements Comparator
{
 @Override	
 public int compare(Object obj1,Object obj2)	
 {
   String s1=obj1.toString();
   String s2=obj2.toString();
   return s2.compareTo(s1);   
 }
}
public class TreeMapD 
{
  public static void main(String[] args) 
  {
   TreeMap m=new TreeMap(new mycomparator1());
   m.put("XXX",10);
   m.put("AAA",20);
   m.put("ZZZ",30);
   m.put("LLL",40);
 m.put("aa","AAA");
// m.put(null,"AAA");
   System.out.println(m);
   }
}