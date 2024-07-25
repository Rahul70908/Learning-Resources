package oops;
class Ppc 
{
  public void m1()
  {
	System.out.println("In parent");
  }
}
class Chc extends Ppc
{
  public void m1()
  {
	System.out.println("In Child");
  }	
}
public class OverridingD
{
  public static void main(String[] args) 
  {
    Ppc obj1=new Ppc();
    obj1.m1();
    
    Chc obj2=new Chc();
    obj2.m1();
    
    Ppc obj3=new Chc();
    obj3.m1();
  }
}