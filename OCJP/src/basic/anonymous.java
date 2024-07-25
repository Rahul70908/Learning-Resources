package basic;
public class anonymous 
{
  public static void main(String[] args) 
  {
	sum(new int[] {10,20,30});

	//	Runnable[] r=new Runnable[10];
  }
   public static void sum(int []x)
   {
   	int total=0;
   	 for(int x1 : x) 
   	 {
	   total+=x1;
	 }
      System.out.println(total);
   }
}
