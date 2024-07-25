package oops;
public class RIWO 
{
  static int x=10;
  static 
  {
   m1();
   System.out.println("First Static block");
  }
  public static void main(String[] args) 
  {
    m1();
    System.out.println("Main method");
  }
  public static void m1()
  {
	System.out.println(y);
  }
  static 
  {
   System.out.println("Second Static block");
  }
  static int y=10;
}