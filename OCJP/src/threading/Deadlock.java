package threading;
class A 
{
  public synchronized void d1(B b)
  {
  System.out.println("thread1 starts execution of d1 method");
  try 
  {
	Thread.sleep(5000);
  }catch (InterruptedException e){}
   System.out.println("Thread1 trying to call B's last() method");
   b.last();
  }
  public synchronized void last()
  {
 	System.out.println("Inside A last() method");
  }
}
class B
{
  public synchronized void d2(A a)
  {
  System.out.println("Thread2 starts execution of d2 method");
  try {
	Thread.sleep(5000);
       }catch (InterruptedException e){}
    System.out.println("Thread2 trying to call A's last() method");
    a.last();
  }
  public synchronized void last()
  {
	  System.out.println("Inside B last() method");
  }
}
public class Deadlock extends Thread 
{
  A a=new A();
  B b=new B();
  public void m1()
  {
    this.start();
	a.d1(b); 
  }
  @Override
  public void run() 
  {
	b.d2(a);
  }
  public static void main(String[] args) 
  {
    Deadlock d=new Deadlock();
	d.m1();
  }
}