package threadEnhancement;
class customerthread extends Thread
{
  static Integer cust_id=0;
  private static ThreadLocal tl=new ThreadLocal()
  {
	protected Integer initialValue()
	{
	  return ++cust_id;
	}
  };
   customerthread(String name) 
   {
	super(name);
   }
   @Override
   public void run() 
   {
    System.out.println(Thread.currentThread().getName()+" Executing with customer id :"+tl.get());
   }
}
public class LocalThread3 
{
  public static void main(String[] args) 
  {
	customerthread t1=new customerthread("thread-1");
	customerthread t2=new customerthread("thread-2");
	customerthread t3=new customerthread("thread-3");
	customerthread t4=new customerthread("thread-4");
    t1.start();
    t2.start();
    t3.start();
    t4.start();
  }
}