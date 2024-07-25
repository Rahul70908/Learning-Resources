package threadEnhancement;
class thread15 extends Thread
{
  thread15(ThreadGroup g,String name) 
  {
	super(g,name);
  }
  @Override
  public void run() 
  {
  	System.out.println("Child thread");
	try
	{
	 Thread.sleep(5000);
	}catch(InterruptedException e){}
  }
}
public class Methods 
{
  public static void main(String[] args)throws InterruptedException 
  {
	ThreadGroup pg=new ThreadGroup("Parent group");
	ThreadGroup cg=new ThreadGroup(pg,"Child group");
	thread15 t1=new thread15(pg,"child thread 1");
	thread15 t2=new thread15(pg,"child thread 2");
	t1.start();
	t2.start();	
	System.out.println(pg.activeCount());
	System.out.println(pg.activeGroupCount());
	pg.list();
    Thread.sleep(10000);
    System.out.println(pg.activeCount());
    System.out.println(pg.activeGroupCount());
    pg.list();
 }
}