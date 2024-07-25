package threadEnhancement;
public class LocalThread2 
{
  public static void main(String[] args) 
  {
  	ThreadLocal tl=new ThreadLocal()
	{
	  public Object initialValue()
	  {
	    return "abc";
	  }
	};
	  System.out.println(tl.get());
	 
	  tl.set("rahul");
	  System.out.println(tl.get());
	  
	  tl.remove();
	  System.out.println(tl.get());
  }
}