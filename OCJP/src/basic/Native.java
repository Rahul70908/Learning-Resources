package basic;
public class Native 
{
  static 
  {
	System.loadLibrary(null);
  }
   public native void m1();	
}
class client
{
// volatile final int x=10;
   public static void main(String[] args) 
   {
	 Native obj=new Native();
	 obj.m1();
   }
}