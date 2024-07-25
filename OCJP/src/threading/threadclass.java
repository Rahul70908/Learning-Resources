package threading;
class mythread extends Thread
{
  public void run()
  {
	for (int i = 0; i <10; i++) 
	{
	 System.out.println("Child thread");
	}
  }
}
public class threadclass 
{
  public static void main(String[] args) 
  {
    mythread t=new mythread();
    t.start();
    for (int i = 0; i <10; i++) 
    {
	 System.out.println("main thread");
	}
  }
}