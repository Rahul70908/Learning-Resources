package threading;
class displayy
{
  public static synchronized void wish(String name)
  {
	for (int i = 0; i < 5; i++) 
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
class thread9 extends Thread
{
  displayy d;
  String name;
  public thread9(displayy d,String name) 
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
public class Synchronizedd2
{
  public static void main(String[] args) 
  {
	displayy d1=new displayy();
	displayy d2=new displayy();
	thread9 t=new thread9(d1,"rahul");
	thread9 t2=new thread9(d2,"sarfu");
	t.start();
    t2.start();
  }
}