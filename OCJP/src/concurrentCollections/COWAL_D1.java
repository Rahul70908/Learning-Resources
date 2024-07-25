package concurrentCollections;
import java.util.concurrent.*;
import java.util.*;
public class COWAL_D1 
{
  public static void main(String[] args) 
  {
    ArrayList l=new ArrayList();
    l.add("A");
    l.add("B");
    System.out.println(l);//[A,B]
    
    CopyOnWriteArrayList l1=new CopyOnWriteArrayList();
    l1.addIfAbsent("A");
    l1.addIfAbsent("C");
    l1.addAll(l);
    System.out.println(l1);//[A,C,A,B]
//    
    ArrayList<String> l2=new ArrayList();
    l2.add("A");
    l2.add("E");
    l1.addAllAbsent(l2);
    System.out.println(l1);//[A,C,A,B,E]
  }
}