package concurrentCollections;
import java.util.concurrent.*;
public class CHMapD1 
{
  public static void main(String[] args)
  {
	ConcurrentHashMap<Integer, String> m=new ConcurrentHashMap<>();
	m.put(101,"A");
	m.put(102,"B");
	m.putIfAbsent(103,"C");
	m.putIfAbsent(101,"D");
	
	m.remove(101,"D");
	m.replace(102,"B","E");
	System.out.println(m);   
  }
}
