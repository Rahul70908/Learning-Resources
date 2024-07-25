package collectionss;
import java.util.*;
public class HashMapD
{
 public static void main(String[] args) 
 {
  HashMap m=new HashMap();
  m.put("chiranjeevi",700);
  m.put("balaiah",800);
  m.put("vankatesh",200);
  m.put("nagarjuna",500);
  System.out.println(m);
  
  System.out.println(m.put("vankatesh",1000));
  
  Set s=m.keySet();
  System.out.println(s);
  
  Collection c=m.values();
  System.out.println(c);
  
  Set s1=m.entrySet();
  System.out.println(s1);
  
  Iterator itr=s1.iterator();
   while(itr.hasNext())
   {
	Map.Entry m1=(Map.Entry)itr.next();
    System.out.println(m1.getKey()+"---"+m1.getValue());
    if(m1.getKey().equals("nagarjuna"))
    {
      m1.setValue(1090);
    }
   }
   System.out.println(m);
   }
 }