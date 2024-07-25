package oops;
class A
{
  public void m1()
  {
   System.out.println("In A");
  }
}
class B extends A
{
  public void m2()
  {
	  System.out.println("In C");	  
  }
}
class C2 extends B
{
	public static void main(String[] args)
	{
	  C2 c=new C2();
	  c.m1();
	  c.m2();
	}
}