package threadEnhancement;
class parent extends Thread
{
  static InheritableThreadLocal tl=new InheritableThreadLocal() 
  {
	public Object childValue(Object p) 
	{
	  return "cc";
	}
  };
  @Override
  public void run() 
  {
	tl.set("pp");
	System.out.println("Parent value "+tl.get());
	child t2=new child(); 
	t2.start();
  }
}
class child extends Thread
{
  @Override
  public void run() 
  {
    System.out.println("Child value "+parent.tl.get());
  }
}
public class LocalThread4 
{
  public static void main(String[] args) 
  {
    parent t1=new parent();
	t1.start();
  }
}