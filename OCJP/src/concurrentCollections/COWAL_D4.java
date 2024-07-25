package concurrentCollections;
import java.util.concurrent.*;
import java.util.*;
public class COWAL_D4
{
  public static void main(String[] args) 
  {  
//	ArrayList l=new ArrayList();  
    CopyOnWriteArrayList l=new CopyOnWriteArrayList();
    l.add("A");
    l.add("B");
    l.add("C"); 
    Iterator itr=l.iterator();
    l.add("D");
    while(itr.hasNext())
    {
     String s=(String)itr.next();
     System.out.println(s);
    }
//    System.out.println(l);
  }
}