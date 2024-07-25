package threading;
class mythread2 extends Thread
{
}
public class Priority 
{
  public static void main(String[] args) 
  {
    System.out.println(Thread.currentThread().getPriority());
    Thread.currentThread().setPriority(7);
    System.out.println(Thread.currentThread().getPriority());
    mythread1 t=new mythread1();
    System.out.println(t.getPriority());
  }
}