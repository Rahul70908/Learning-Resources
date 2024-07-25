package threading;
class thread12 extends Thread
{
  int total=0;
  @Override
  public void run() 
  {
   synchronized (this) 
   {
	System.out.println("Child thread start calculation");
	for(int i = 1; i <=100; i++) 
	{
	 total=total+i;
	}
	System.out.println("Child thread giving notification");
	this.notify();
   }		
  }
}
public class Communication 
{
  public static void main(String[] args)throws InterruptedException
  { 
   thread12 t=new thread12();
   t.start();
   Thread.sleep(10000);
   synchronized (t) 
   {
    System.out.println("Main thread trying to call wait() method");
    t.wait(10000);
   }
    System.out.println("main thread got notificaton");
    System.out.println(t.total);
  }
}