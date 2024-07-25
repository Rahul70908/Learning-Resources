package wrapperclass;
public class AutoBoxingVsVarargs 
{
  public static void m1(int... i) 
  {
	System.out.println("Var Args-Method");
  }
  public static void m1(Integer I) 
  {
	System.out.println("Auto boxing");
  }
  public static void main(String[] args) 
  {
  	int x=10;
  	m1(x);
  }
}