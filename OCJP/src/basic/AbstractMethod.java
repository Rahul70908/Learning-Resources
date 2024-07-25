package basic;
abstract class vehicle
{
abstract public int getvehicles();
}
 class bus extends vehicle
 {
   public int getvehicles()
   {
	return 7;
   }	
 }
class auto extends vehicle
{
  public int getvehicles()
  {
	return 3;
  }
}
 public class AbstractMethod
 {
   public static void main(String[] args)
   {
	bus obj=new bus();
	System.out.println(obj.getvehicles());
	 
	auto obj1=new auto();
	System.out.println(obj1.getvehicles());
   }
 }