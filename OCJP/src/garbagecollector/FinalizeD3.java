package garbagecollector;
public class FinalizeD3 
{
   static FinalizeD3 s;	
  public static void main(String[] args)throws InterruptedException 
  {
	FinalizeD3 f=new FinalizeD3();
	System.out.println(f.hashCode());
	f=null;
    System.gc();
    Thread.sleep(5000);
	System.out.println(s.hashCode());
	s=null;
    System.gc();
    Thread.sleep(10000);
	System.out.println("End of main method");
  }
  public void finalize()
  {
	System.out.println("Finalize method called");
    s=this;
  }
}