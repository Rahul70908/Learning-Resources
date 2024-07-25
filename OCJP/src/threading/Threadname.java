package threading;
class mythread1 extends Thread
{
  @Override
  public void run()
  {
   System.out.println("run method is executed by thread "+Thread.currentThread().getName());
  }
}
public class Threadname 
{
  public static void main(String[] args) 
  {
   System.out.println(Thread.currentThread().getName());
   Thread.currentThread().setName("rahul gupta");
   System.out.println(Thread.currentThread().getName());
   mythread1 t=new mythread1();
   t.start();
   System.out.println("Main method is executed by "+Thread.currentThread().getName());
  }
}
