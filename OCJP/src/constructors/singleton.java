package constructors;
class test7 
{
  static int count=0;	
  private static test7 t=null;
  private test7() 
  {
    count++;
  }	
  public static test7 gettest7()
  {
   if(t==null)
   {
	 t=new test7();
   }
   	return t;
  }
  public static void main(String[] args) 
  {
   test7 t1=test7.gettest7();
   test7 t2=test7.gettest7();
   System.out.println(count);
  }
}