package exceptionhandling;
import java.util.Scanner;
class retriveMax extends RuntimeException
{
   retriveMax(String s) 
   {
	 super(s);
   }
}
public class Retrieve
{
	public static void main(String[] args) 
	{
		//que3
		boolean flag=true;
		int[]marks=new int[3];
		marks[0]=4;
		marks[1]=7;
		marks[2]=9;
		Scanner sc=new Scanner(System.in);
		int index;
		int i=0;
		while(flag && i<5)
		{
		  try
		  {
			System.out.println("enter the index value");
			index=sc.nextInt();
			System.out.println("the value of marks[index] is:" + marks[index]);
			break;
		  }
		  catch(Exception e)
		  {
			System.out.println("invalid index");
			i++;
		  }
		}
		if(i>=5)
		{
          System.out.println("Error");
          try
          {
           throw new retriveMax("");
          }
          catch(Exception e)
          {
           System.out.println("Exception:"+e);
          }
         }
	}
}