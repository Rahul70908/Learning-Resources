package oops;
class parent
{
  int i=10;
 { 
  m1();
  System.out.println("Parent instance block");
 }
  public parent() 
  {
  System.out.println("Parent Constructor");
  }
  public static void main(String[] args) 
  {
	parent p = new parent();
    System.out.println("Parent main");
  }
 public void m1() 
 {
  System.out.println(j);
 }
  int j=20;
}
class small extends parent
{
  int x=100;
  {
    m2();
	System.out.println("Child first instance block");
  }
  public small() 
  {
   System.out.println("Child constructor");
  }
  public static void main(String[] args) 
  {
	small s =new small();
	System.out.println("child main method");
  }
   public void m2() 
   {
	System.out.println(y);
   }
   {
	System.out.println("Child second instance block");
   }
   int y=200;
}