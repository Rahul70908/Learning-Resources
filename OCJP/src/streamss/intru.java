package streamss;
interface tvremote
{
  void channel();
}
interface smartremote extends tvremote
{
  void setbox();
}
public class intru implements smartremote
{
  @Override	
  public void channel() 
  {
	 System.out.println("Hello"); 
  }	
  @Override
  public void setbox()
  {
	  System.out.println("Hii"); 
  }
  public static void main(String[] args) 
  {
	smartremote t=new intru();
	t.channel();
	t.setbox();
  }
}