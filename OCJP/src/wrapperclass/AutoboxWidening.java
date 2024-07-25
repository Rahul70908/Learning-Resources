package wrapperclass;
public class AutoboxWidening 
{
  public static void m1(Object o) 
  {
	System.out.println("object Version"); 	 
  }	
  public static void main(String[] args) 
  {
    Number x=10;
    m1(x);
  }
}