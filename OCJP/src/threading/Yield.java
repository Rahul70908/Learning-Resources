package threading;
class mythread4 extends Thread
{
  @Override
  public void run() 
  {
	for (int i = 0; i < 10; i++) 
	{
	 System.out.println("child thread");
	 Thread.yield();
	}
  }
}
public class Yield 
{
  public static void main(String[] args) 
  {
	mythread4 t=new mythread4();
	t.start();
	for (int i = 0; i < 10; i++) 
	{
	 System.out.println("main thread");
	} 
  }
}