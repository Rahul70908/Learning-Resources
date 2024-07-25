package concurrentCollections;
import  java.util.*;
class ConModEx extends Thread
{
   static ArrayList l=new ArrayList();
   @Override
   public void run()
   {
	 try
	 {
	  Thread.sleep(2000);	
	 }
	 catch(InterruptedException e){}
	 System.out.println("Child Thread Updating List");
	 l.add("D");
   }
  public static void main(String[] args)throws InterruptedException 
  {
   	l.add("A");
   	l.add("B");
   	l.add("C");
    ConModEx t =new ConModEx();
    t.start();
    Iterator itr=l.iterator();
    while(itr.hasNext())
    {
      String s=(String)itr.next();
      System.out.println("Main thread iterating List and current object is "+s);	
      Thread.sleep(3000);
    }
    System.out.println(l);
  }
}