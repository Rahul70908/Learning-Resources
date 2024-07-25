package innerclass;
public class Outer5 
{
  int x=10;
  static int y=20;
   class inner5
   {
    public void m1()
	{
     System.out.println(x);	
     System.out.println(y);
	}
  }
   public static void main(String[] args) 
   {
	new Outer5().new inner5().m1();
   }
}