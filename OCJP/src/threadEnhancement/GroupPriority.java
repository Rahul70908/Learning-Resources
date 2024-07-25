package threadEnhancement;
public class GroupPriority
{
  public static void main(String[] args) 
  {
    ThreadGroup tg=new ThreadGroup("First Group");
    
    Thread t1=new Thread(tg,"First thread");
    System.out.println(t1.getPriority());
    
    Thread t2=new Thread(tg,"Second thread");
    System.out.println(t2.getPriority());

    tg.setMaxPriority(3);
    
    Thread t3=new Thread(tg,"Third thread");
    System.out.println(t3.getPriority());
  }
}