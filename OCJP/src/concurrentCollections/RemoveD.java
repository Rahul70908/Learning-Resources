package concurrentCollections;
import java.util.concurrent.ConcurrentHashMap;
public class RemoveD 
{
   public static void main(String[] args) 
   {
     ConcurrentHashMap m=new ConcurrentHashMap();
     m.put(101,"durga");
     m.remove(101,"shiva");
     System.out.println(m);
  
     m.remove(101,"durga");
     System.out.println(m); 
   }
}