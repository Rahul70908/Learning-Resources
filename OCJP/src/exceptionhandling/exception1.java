package exceptionhandling;
public class exception1
{
  public static void main(String[] args) 
  {
    dostuff(); 
    System.out.println(10/0);
  }
  public static void dostuff()
  {
	domorestuff();
    System.out.println("Hii");
  }	
  public static void domorestuff()
  {
   System.out.println("Hello");
  }	
}