package threadEnhancement;
import java.util.concurrent.locks.*;
class mythread1 extends Thread
{
  static ReentrantLock l=new ReentrantLock();
  mythread1(String name) 
  {
   super(name);
  }
  @Override
  public void run() 
  {
   if(l.tryLock())
   {
    System.out.println(Thread.currentThread().getName()+" got lock and performing operation");
    try
	{
	 Thread.sleep(2000);
	}catch(InterruptedException e){}
	 l.unlock();
	}
	else
	{
	System.out.println(Thread.currentThread().getName()+" unable to get lock and hence performing altenative operation");
	}
  }
}
public class Trylock 
{
 public static void main(String[] args) 
 {
   mythread1 t1=new mythread1("First thread");
   mythread1 t2=new mythread1("second thread");
   t1.start();
   t2.start();
 }
}