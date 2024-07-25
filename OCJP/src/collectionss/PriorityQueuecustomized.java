package collectionss;
import java.util.*;
class mycomparator3 implements Comparator
{
  public int compare(Object obj1,Object obj2)
  {
	String s1=(String)obj1;
	String s2=obj2.toString();
	return s2.compareTo(s1);
  }
}
public class PriorityQueuecustomized 
{
  public static void main(String[] args) 
  {  
   PriorityQueue<String> q=new PriorityQueue<String>(15,new mycomparator3());
   q.offer("A");
   q.offer("A");
   q.offer("Z");
   q.offer("L");
   q.offer("B");
   q.offer("B");
   System.out.println(q);
  }
}