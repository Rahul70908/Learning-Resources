package concurrentCollections;
import java.util.concurrent.*;
import java.util.*;
public class COWAL_D3 
{
  public static void main(String[] args) 
  {
//	ArrayList l=new ArrayList();  
    CopyOnWriteArrayList l=new CopyOnWriteArrayList();
    l.add("A");
    l.add("B");
    l.add("C");
    l.add("D");
    System.out.println(l);
    
    Iterator itr=l.iterator();
    while(itr.hasNext())
    {
      String s=(String)itr.next();
      if(s.equals("D"))
      {
    	itr.remove();
      }
    }
    System.out.println(l);
  }
}