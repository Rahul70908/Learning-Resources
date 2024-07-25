package threadEnhancement;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.*;
class thread2 extends Thread
{
  static ReentrantLock l=new ReentrantLock();
  thread2(String name) 
  {
   super(name);
  }
  @Override
  public void run() 
  {
    do
    {
 	 try
 	 {
	  if(l.tryLock(5000,TimeUnit.MILLISECONDS))
	  {
       System.out.println(Thread.currentThread().getName()+" got lock...");
	   Thread.sleep(30000);		
	   System.out.println(Thread.currentThread().getName()+" releases lock...");
	   l.unlock();
	   break;
	  }
	  else
	  {
       System.out.println(Thread.currentThread().getName()+" unable to get lock hence try again");
	  }
	 }catch(Exception e){}
	}while(true);	
  }
}
public class Trylocktime 
{
  public static void main(String[] args) 
  {
	thread2 t1=new thread2("First thread");
	thread2 t2=new thread2("second thread");
	t1.start();
	t2.start();
  }
}