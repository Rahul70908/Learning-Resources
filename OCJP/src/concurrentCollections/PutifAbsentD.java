package concurrentCollections;
import java.util.concurrent.ConcurrentHashMap;
public class PutifAbsentD 
{
  public static void main(String[] args) 
  {
    ConcurrentHashMap m=new ConcurrentHashMap();
    m.put(101,"durga");
    m.put(101,"Ravi");
    System.out.println(m);
    
    m.putIfAbsent(101,"Shiva");
    System.out.println(m);
  }
}