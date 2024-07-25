package basic;
public class Transferstmnt 
{
  public static void main(String[] args) 
  {
//  int x=10;
//  l1:
//  {
//   System.out.println("Begin");
//   if(x==10)
//   break l1;
//   System.out.println("end");
//  }
//   System.out.println("Hello");
	 int x=0;
	 do 
	 {
	   x++;
	   System.out.println(x);
	  if(++x<5)
	  continue;
	  x++;
	 System.out.println(x);
	 } while (++x<10);
  }
}