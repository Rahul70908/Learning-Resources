package innerclass;
class Outer9
{
   public  void m1()
   {
	 int x=10;  
	 class inner9
	 {
      public void m2()
	  { 
	   System.out.println(x);
	  }
	 }
	 inner9 i=new inner9();
     i.m2();
   }
   public static void main(String[] args) 
   {
	 Outer9 o=new Outer9();
	 o.m1();
   }
}