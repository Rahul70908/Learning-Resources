package innerclass;
class Outer8 
{
   int x=10;
   static int y=20;
   public void m1()
   {
	  class inner8
	  {
	  public void m2()
	  {
	   System.out.println(x);
	   System.out.println(y);
	  }
	}
	  inner8 i=new inner8();
      i.m2();
   }
   public static void main(String[] args) 
   {
	 Outer8 o=new Outer8();
	 o.m1();
   }
}