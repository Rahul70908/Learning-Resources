package stringg;
final class custom
{
	private int i;
	public custom(int i) 
	{
	  this.i=i;
	}
	public custom modify(int i)
	{
		if(this.i==i)
		{
		return this;
	    }
		else
		{
         return (new custom(i));	
		}
	}
}
class Immute
{
	public static void main(String[] args) 
	{
	    custom t1=new custom(10);
	    custom t2=t1.modify(100);
	    custom t3=t1.modify(10);
	    System.out.println(t1==t2);
	    System.out.println(t1==t3);
	}
}