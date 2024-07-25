package oops;
class Pp 
{
  public static void m1()
  {
	System.out.println("In parent");
  }
}
class Ch extends Pp
{
  public static void m1()
  {
	System.out.println("In Child");
  }	
}
public class MethodHidingD
{
  public static void main(String[] args) 
  {
    Pp obj1=new Pp();
    obj1.m1();
    
    Ch obj2=new Ch();
    obj2.m1();
    
    Pp obj3=new Ch();
    obj3.m1();
  }
}