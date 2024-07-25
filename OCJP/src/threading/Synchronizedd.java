package threading;
class display
{
  public synchronized void wish(String name)
  {
	for (int i = 0; i < 7; i++) 
	{
	 System.out.print("Good morning: ");
	  try
	  {
	   Thread.sleep(1000);
	  }
	  catch(InterruptedException e){}
     System.out.println(name);
	}
  }
}
class thread8 extends Thread
{
  display d;
  String name;
  public thread8(display d,String name) 
  {
	this.d=d;
	this.name=name;
  }
  @Override
  public void run() 
  {
   d.wish(name);
  }
}	
public class Synchronizedd
{
  public static void main(String[] args) 
  {
	display d1=new display();
	thread8 t=new thread8(d1,"rahul");
	thread8 t2=new thread8(d1,"sarfu");
	thread8 t3=new thread8(d1,"vivek");
	t.start();
    t2.start();
    t3.start();
  }
}