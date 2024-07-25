package threading;
class myrunnable implements Runnable
{
  @Override
  public void run() 
  {
    for (int i = 0; i <10; i++) 
    {
	 System.out.println("Child thread");
	}	
  }
}
public class Runnables 
{
  public static void main(String[] args) 
  {
	myrunnable obj=new myrunnable();
	Thread t=new Thread(obj);
	t.start();
	for (int i = 0; i <10; i++) 
	{
	 System.out.println("main thread");
	}	
  }
}