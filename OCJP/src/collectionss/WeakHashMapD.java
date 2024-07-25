package collectionss;
import java.util.*;
class temp
{
  public String toString()
  {
	return "temp";
  }
  public void finalize()
  {
    System.out.println("Finalize method called");
  }
}
public class WeakHashMapD 
{
  public static void main(String[] args)throws InterruptedException 
  {
//   HashMap m = new HashMap();	  
   WeakHashMap m=new WeakHashMap();
   temp t=new temp();
   m.put(t,"Durga");
   System.out.println(m);
   t=null;
   System.gc();
   Thread.sleep(3000);
   System.out.println(m); 
  }
}