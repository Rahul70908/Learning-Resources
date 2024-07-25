package innerclass;
public class Outer4 
{
  class inner4
  {
	public void m1()
	{
	  System.out.println("Inner class method");
	}
  }
}
class test
{
  public static void main(String[] args) 
  {
//  Outer4 o=new Outer4();
//  Outer4.inner4 i=o.new inner4();
//  i.m1();
//	new Outer4().new inner4().m1();	
  }
}