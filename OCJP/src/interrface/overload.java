package interrface;
interface left
{
 int x=77;
}
interface right
{
   int x=88;
}
class test implements left,right
{
  public static void main(String[] args) 
  {
	System.out.println(left.x);
	System.out.println(right.x);
  }
}