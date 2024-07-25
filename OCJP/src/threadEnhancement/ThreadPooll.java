package threadEnhancement;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class thread3 implements Runnable
{
  String name;
  thread3(String name) 
  {
   this.name=name;
  }
  @Override
  public void run() 
  {
   System.out.println(name+"..job started by thread"+Thread.currentThread().getName());
   try
   {
	Thread.sleep(3000);
   }catch(InterruptedException e){}
    System.out.println(name+"..job completed by thread "+Thread.currentThread().getName());
  }
}
public class ThreadPooll 
{
  public static void main(String[] args) 
  { 
   thread3[] jobs={
			        new thread3("rahul")
//			        new thread3("sarfu"),
//			        new thread3("vivek"),
//			        new thread3("tyagi"),
//			        new thread3("aariz"),
//			        new thread3("keshav"),
//			        new thread3("aariz"),
//			        new thread3("keshav"),
	              };
   ExecutorService s=Executors.newFixedThreadPool(5);
   for(thread3 t : jobs) 
   {
	s.submit(t);
   }
    s.shutdown();
  }
}