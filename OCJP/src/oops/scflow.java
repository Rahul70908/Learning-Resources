package oops;
class base
{
  static int i=10;
  static 
  {
	m1();
	System.out.println("Base static block");
  }
  public static void main(String[] args) 
  {
	m1();
	System.out.println("Base main");
  }
  public static void m1() 
  {
	System.out.println(j);
  }
	static int j=20;
}
class derived extends base
{	
  static int x=100;
  static
  {
   m2();
   System.out.println("Derived first static block");
  } 
  public static void main(String[] args) 
  {
   m2();
   System.out.println("Derived main");
  }
  public static void m2() 
  {
	System.out.println(y);
  }
  static
  {
   System.out.println("Derived second static block");
  }
  static int y=200;
}