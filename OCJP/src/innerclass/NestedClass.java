package innerclass;
class Outer10
{
 static class Nested 
 {
    public void m1()
    {
      System.out.println("Static nested class method");
    }
 }
   public static void main(String[] args) 
   {
    Nested n=new Nested();	
    n.m1();
  }
}