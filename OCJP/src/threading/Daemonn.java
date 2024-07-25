package threading;
class thread13 extends Thread
{
	
}
public class Daemonn
{
  public static void main(String[] args) 
  {
    System.out.println(Thread.currentThread().isDaemon());
//  Thread.currentThread().setDaemon(true);
	
    thread13 t=new thread13();
	System.out.println(t.isDaemon());
	t.setDaemon(true);
	System.out.println(t.isDaemon());
  }
}