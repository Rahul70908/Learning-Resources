package concurrentCollections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.*;
public class CHMapD2 extends Thread
{
//   static HashMap m=new HashMap();	
  static ConcurrentHashMap m=new ConcurrentHashMap();
   @Override
   public void run()
   {
	 try
	 {
	  Thread.sleep(2000);	
	 }
	 catch(InterruptedException e){}
	 System.out.println("Child Thread Updating Map");
	 m.put(103,"C");
   }	
   public static void main(String[] args)throws InterruptedException 
   {
     m.put(101,"A");
     m.put(102,"B");
     CHMapD2 t =new CHMapD2();
     t.start();
     Set s1=m.keySet();
     Iterator itr=s1.iterator();
     while(itr.hasNext())
     {
      Integer i=(Integer)itr.next();
      System.out.println("Main thread Iterating Map and Current Entry is "+i+"----"+m.get(i));
      Thread.sleep(3000);
     }
     System.out.println(m);
   }
}