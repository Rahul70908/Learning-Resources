package constructors;
class test3
{
  static int count =0;
  {
  count++;
  }
  test3() 
  {
   super();
// this();
  }
  test3(int i) 
  {
  }
  test3(double d) 
  {
  }
  public static void main(String[] args) 
  {
   test3 t1=new test3();
   test3 t2=new test3(10);
   test3 t3=new test3(10.5);
   System.out.println("Number of objects created is "+count);
  }
}