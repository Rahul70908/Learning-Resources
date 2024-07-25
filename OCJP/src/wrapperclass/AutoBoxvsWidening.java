package wrapperclass;
public class AutoBoxvsWidening
{
  public static void m1(Integer I) 
  {
	System.out.println("Autoboxing");
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