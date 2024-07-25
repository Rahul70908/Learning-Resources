package threading;
class dthread extends Thread
{
  @Override
  public void run() 
  {
   System.out.println("Child thread");
  }
}
public class customdefine 
{
  public static void main(String[] args) 
  {
	dthread	t =new dthread();
	Thread t1=new Thread(t);
	t1.start();
	System.out.println("main thread");
  }
}