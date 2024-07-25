package classcombinaton;
class Vehicletype
{
  interface vehicle
  {
    public int getwheels();
  }
  class bus implements vehicle
  {
	public int getwheels() 
	{
      return 6;     	
	} 
  }
  class Auto implements vehicle
  {
	public int getwheels() 
	{
      return 3;     	
	} 
  }
  public static void main(String[] args) 
  {
	Vehicletype v=new Vehicletype();  
	Vehicletype.bus b=v.new bus();
    System.out.println(b.getwheels());
  
	Vehicletype.Auto a=v.new Auto();
    System.out.println(a.getwheels());
  }
}