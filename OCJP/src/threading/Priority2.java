package threading;
class mythread3 extends Thread
{
  @Override
  public void run() 
  {
	for (int i = 0; i < 5; i++) 
	{
	 System.out.println("Child thread");
	}
  }
}
public class Priority2 
{
  public static void main(String[] args) 
  {
	mythread3 t=new mythread3();
	t.setPriority(10);
	t.start();
	for (int i = 0; i < 5; i++) 
	{
	  System.out.println("parent thread");
	}
  }
}