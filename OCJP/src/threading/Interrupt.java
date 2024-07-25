package threading;
class thread7 extends Thread
{
  @Override
  public void run() 
  {
	try 
	{
	  for (int i = 0; i < 10; i++)
	  {
	    System.out.println("child thread");
        Thread.sleep(1000);
	  }
	}
	catch(InterruptedException e) 
	{
     System.out.println("i got Interrupted");
	}
  }
}
public class Interrupt 
{
  public static void main(String[] args)throws InterruptedException 
  {
	thread7 t=new thread7();
    t.start(); 
    t.interrupt();
    System.out.println("end of main");
  }
}