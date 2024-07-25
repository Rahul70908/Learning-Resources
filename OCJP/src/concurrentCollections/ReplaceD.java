package concurrentCollections;
import java.util.concurrent.ConcurrentHashMap;
public class ReplaceD 
{
   public static void main(String[] args) 
   {
     ConcurrentHashMap<Integer, String> m=new ConcurrentHashMap<>();
     m.put(101,"durga");
     m.replace(101,"durga","shiva");
     System.out.println(m);
   }
}