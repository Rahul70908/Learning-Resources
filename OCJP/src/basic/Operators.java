package basic;
public class Operators 
{
  public static void main(String[] args) 
  {
	Thread t1=new Thread();
	System.out.println(t1 instanceof Thread);
	System.out.println(t1 instanceof Object);
	System.out.println(t1 instanceof Runnable);

//	System.out.println(t1 instanceof String);
	System.out.println(null instanceof Thread);
	
	System.out.println("\n"+~-5);
	
	System.out.println("\n"+!true);
  }
}
