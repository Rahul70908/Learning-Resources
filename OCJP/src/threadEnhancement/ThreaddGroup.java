package threadEnhancement;
public class ThreaddGroup 
{
 public static void main(String[] args) 
 {
 System.out.println(Thread.currentThread().getThreadGroup().getName());
 System.out.println("\n"+Thread.currentThread().getThreadGroup().getParent().getName());
 
 ThreadGroup tg=new ThreadGroup("First group");
 System.out.println("\n"+tg.getName());
 System.out.println(tg.getParent().getName());
 
 ThreadGroup tg1=new ThreadGroup(tg,"Second group");
 System.out.println("\n"+tg1.getName());
 System.out.println(tg1.getParent().getName());
 }
}