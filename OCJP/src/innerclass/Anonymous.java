package innerclass;
class popcorn
{
  public void taste()
  {
	  System.out.println("Salty");
  }
}
public class Anonymous
{
  public static void main(String[] args) 
  {
    popcorn p1=new popcorn();
	p1.taste();
		
	popcorn p2=new popcorn()
	{
	  public void taste()
	  {
		System.out.println("Spicy"); 
	  }	
	};
	p2.taste();
	
	popcorn p3=new popcorn() 
	{
	 public void taste() 
	 {
	   System.out.println("Sweet");
	 }	
	};
	
	p3.taste();
	
	System.out.println(p1.getClass().getName());
	System.out.println(p2.getClass().getName());
	System.out.println(p3.getClass().getName());
  }
}