package innerclass;
public class Outer2
{
   class inner2
   {
	public void m1()
	{
	  System.out.println("Inner class method");	
	}
   }
   public static void main(String[] args) 
   {
//	Outer2 o=new Outer2();
//	Outer2.inner2 i=o.new inner2();
//      OR
    Outer2.inner2 i=new Outer2().new inner2();   
	 i.m1();
//	      OR
//	 new Outer2().new inner2().m1();
   }
}
