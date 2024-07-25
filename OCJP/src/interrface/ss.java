package interrface;
class p 
{
  p()
  {
    System.out.println(this.hashCode());
  }
}
class c extends p
{
  c()
  {
	System.out.println(this.hashCode());
  }
}
public class ss 
{
  public static void main(String[] args) 
  {
	c obj=new c();
	System.out.println(obj.hashCode());
  }
}
