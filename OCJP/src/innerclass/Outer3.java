package innerclass;
public class Outer3 
{
  class inner3
  {
	public void m1()
	{
	  System.out.println("Inner class method");
	}
 }
    public void m2()
    {
	 inner3 i=new inner3();
	 i.m1();
    }
    public static void main(String[] args) 
    {
      Outer3 o=new Outer3();
	  o.m2();
    }
}