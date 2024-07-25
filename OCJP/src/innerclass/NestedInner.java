package innerclass;
class A 
{
   class B
   {
	   class C
	   {
		   public void m1()
		   {
			   System.out.println("Innermost m1 method");
		   }
	   }
   }
}
class test1
{
  public static void main(String[] args) 
  {
//	A a=new A();
//	A.B b=a.new B();
//	A.B.C c=b.new C();
//	c.m1();
	new A().new B().new C().m1();
  }
}