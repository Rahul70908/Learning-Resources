package threading;
class thread5 extends Thread
{
  @Override
  public void run() 
  {
    for (int i = 0; i < 10; i++) 
    {
	 System.out.println("Child thread");	
	 try
	 {
	  Thread.sleep(2000);
	 }
	 catch(InterruptedException e){}
    }
  }
}
public class Joinn 
{
  public static void main(String[] args) throws InterruptedException 
  {
    thread5 t=new thread5();
    t.start();
    t.join(10000);
    for (int i = 0; i < 10; i++) 
    {
     System.out.println("Parent thread");	
    }
  }
}