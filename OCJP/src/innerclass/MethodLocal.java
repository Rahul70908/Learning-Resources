package innerclass;
class Outer7 
{
  public void m1()
  {
     class inner7
	 {
	   public void sum(int x,int y)
	   {
		System.out.println("The sum is "+(x+y));
	   }
	 }
	   inner7 i=new inner7();
       i.sum(10,20);
       ;;;;;;;;;;;
       i.sum(100, 200);
       ;;;;;;;;;;;;;;;
       i.sum(1000, 2000);
       ;;;;;;;;;;
   }
   public static void main(String[] args) 
   {
	 Outer7 o=new Outer7();
	  o.m1();
   }
}