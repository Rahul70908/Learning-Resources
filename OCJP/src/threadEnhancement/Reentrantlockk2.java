package threadEnhancement;
import java.util.concurrent.locks.*;
class display
{
  ReentrantLock l=new ReentrantLock();
  public void wish(String name)
  {
	l.lock();
	for (int i = 0; i < 10; i++) 
	{
	  System.out.print("Good morning: ");
	  try 
	  {
	   Thread.sleep(1000);
	  }catch(InterruptedException e){}
	   System.out.println(name);
	}
	l.unlock();
  }
}
class mythread extends Thread
{
  display d;
  String name;
  mythread(display d,String name)
  {
	this.d=d;
	this.name=name;
  }
  @Override
  public void run() 
  {
    d.wish(name);
  }
}
public class Reentrantlockk2 
{
  public static void main(String[] args) 
  {
	display d=new display();
	mythread t1=new mythread(d,"rahul");
	mythread t2=new mythread(d,"sarfu");
	t1.start();
	t2.start();
  }
}