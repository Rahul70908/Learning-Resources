package threading;
class dispp
{	
  public void wish(String name) 
  {
	;;;;;;;//1 lakh line of code
   synchronized(dispp.class)
   {
	for (int i = 0; i <5; i++) 
	{
	  System.out.print("good morning: ");	
	  try 
	  {
	   Thread.sleep(1000);
	  }catch (InterruptedException e){}
	   System.out.println(name);  
	}
	;;;;;;;// 1 lakh line of code
   }
  }
}
class thread11 extends Thread
{
  dispp d;
  String name;
  public thread11(dispp d,String name)
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
public class Syncblock 
{	
  public static void main(String[] args) 
  {
   dispp d1=new dispp();
   dispp d2=new dispp();
   thread11 t=new thread11(d1,"rahul");
   thread11 t1=new thread11(d2,"sarfu");
   t.start();
   t1.start();
  }
}