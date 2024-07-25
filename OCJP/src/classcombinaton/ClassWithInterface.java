package classcombinaton;
interface vehicles
{
   public int getwheels();
   class defaultvehicle implements vehicles
   {
	 public int getwheels() 
	 {
	   return 2;
	 }
   }
}
class buss implements vehicles
{
	public int getwheels() 
	{
	 return 6;
	}
}
class tesst
{
  public static void main(String[] args) 
  {
   vehicles.defaultvehicle d=new vehicles.defaultvehicle();
   System.out.println(d.getwheels());
   
   buss b=new buss();
   System.out.println(b.getwheels());
  }
}