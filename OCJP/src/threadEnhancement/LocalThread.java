package threadEnhancement;
public class LocalThread 
{
  public static void main(String[] args) 
  {
	ThreadLocal tl=new ThreadLocal();
	System.out.println(tl.get());
	
	tl.set("rahul");
	System.out.println(tl.get());
	
	tl.remove();
	System.out.println(tl.get());
  }
}