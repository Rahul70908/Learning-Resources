package pack1;
public class A 
{
  protected void m1()
  {
	System.out.println("Hello");
  }
}
class B extends A
{
	public static void main(String[] args) 
  {
       A obj1=new A();
       obj1.m1();
       
       B obj2=new B();
       obj2.m1();
       
       A obj3=new B();
       obj3.m1();
	}
}