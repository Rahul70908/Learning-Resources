package wrapperclass;
public class WideningVsVarargs
{
  public static void m1(int... i) 
  {
	System.out.println("Var Args-Method");
  }
  public static void m1(long l) 
  {
	System.out.println("Widenning");
  }
  public static void main(String[] args) 
  {
  	int x=10;
  	m1(x);
  }
}