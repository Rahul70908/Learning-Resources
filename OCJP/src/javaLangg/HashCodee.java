package javaLangg;
class test
{
	int i;
	test(int i) 
	{
	  this.i=i;
	}
	@Override
	public String toString() 
	{
	  return i+"";
	}
	@Override
	public int hashCode() 
	{
	  return i;
	}
 public static void main(String[] args) 
 {
   test t1=new test(10);
   System.out.println(t1);
   
   test t2=new test(100);
   System.out.println(t2);
 }
}