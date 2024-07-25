package threading;
class thread6 extends Thread
{
  static Thread t1;
  @Override
  public void run() 
  {
	try
	{
	 t1.join();
	} 
	catch (InterruptedException e){}
    for (int i = 0; i <10; i++) 
    { 
	 System.out.println("child thread");
    } 
  }
}
public class Joinn2 
{
  public static void main(String[] args)throws InterruptedException
  {
   thread6.t1=Thread.currentThread();
   thread6 t=new thread6();
   t.start();
//   t.join();
    for (int i = 0; i <10; i++) 
    {
	 System.out.println("main thread");
	 Thread.sleep(1000);
    }
  }
}