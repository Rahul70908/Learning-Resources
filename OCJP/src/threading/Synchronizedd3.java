package threading;
class disp
{
  public synchronized void displayn()
  {
	for (int i = 0; i < 10; i++) 
	{
	 System.out.print(i);
	 try
	 {
	  Thread.sleep(1000);
	 } 
	 catch (InterruptedException e){}
	}
  }
  public synchronized void displayc()
  {
	for (int i = 65; i <=75; i++) 
	{
	 System.out.print((char)i);
	 try
	 {
	  Thread.sleep(1000);
	 } 
	 catch (InterruptedException e){}
	}
  }
}
class thread0 extends Thread
{
  disp d;
  thread0(disp d) 
  {
	this.d=d;
  }
  @Override
  public void run() 
  {
   d.displayn();
  }
}
class thread01 extends Thread
{
  disp d;
  thread01(disp d) 
  {
   this.d=d;
  }
  @Override
  public void run() 
  {
   d.displayc();
  }
}
public class Synchronizedd3  extends Thread
{
  public static void main(String[] args) 
  {
	disp d1=new disp();
//	thread0 t=new thread0(d1);
	thread01 t1=new thread01(d1);
//    t.start();
    t1.start(); 
  
  }
}