package classcombinaton;
interface outer
{
	public void m1();
	interface inner
	{
		public void m2();
	}
}
class test1 implements outer
{
    @Override
	public void m1() 
	{	
	  System.out.println("Outer interface");
	}
}
class test2 implements outer.inner
{
	@Override
	public void m2() 
	{
	 System.out.println("Inner Interface");
	}
}
class test
{
	public static void main(String[] args) 
	{
	  test1 t1=new test1();	
	  t1.m1();
	  
	  test2 t2=new test2();	
	  t2.m2();
	}
}