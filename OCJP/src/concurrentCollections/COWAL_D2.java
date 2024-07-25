package concurrentCollections;
import java.util.*;
import java.util.concurrent.*;
class COWAL_D2 extends Thread 
{
//	static ArrayList l=new ArrayList();
  static CopyOnWriteArrayList l=new CopyOnWriteArrayList();	
  @Override
  public void run()
  {
	try
	{
      Thread.sleep(2000);
	}
	catch(InterruptedException e){}
	System.out.println("Child Thread updating List");
	l.add("C");
  }
  public static void main(String[] args)throws InterruptedException 
  {
    l.add("A");
    l.add("B");
    COWAL_D2 t=new COWAL_D2();
    t.start();
    Iterator itr=l.iterator();
    while(itr.hasNext())
    {
      String s=(String)itr.next();
      System.out.println("Main thread iterating List and and current object is "+s);
      Thread.sleep(3000);
    }
    System.out.println(l);
  }
}