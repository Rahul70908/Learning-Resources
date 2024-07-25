package threading;
class thread14 extends Thread
{
  @Override
  public void run() 
  {
   for (int i = 0; i < 10; i++) 
   {
	 System.out.println("Child thread");
	 try
	 {
	  Thread.sleep(1000);
	 }catch(InterruptedException e){}
   }
  }
}
public class Daemonn2 
{
  public static void main(String[] args) 
  {
   thread14 t=new thread14();
   t.setDaemon(true);
   t.start();
   System.out.println("End of main thread");
  }
}